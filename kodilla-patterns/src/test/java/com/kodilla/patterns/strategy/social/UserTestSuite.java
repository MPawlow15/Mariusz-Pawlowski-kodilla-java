package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User johny = new Millenials("Johny");
        User max = new YGeneration("Max");
        User tommy = new ZGeneration("Tommy");

        //When
        String johnySocialPublisher = johny.sharePost();
        System.out.println("Johny uses: " + johnySocialPublisher);
        String maxSocialPublisher = max.sharePost();
        System.out.println("Max uses: " + maxSocialPublisher);
        String tommySocialPublisher = tommy.sharePost();
        System.out.println("Tommy uses: " + tommySocialPublisher);

        //Then
        Assertions.assertEquals("Facebook", johnySocialPublisher);
        Assertions.assertEquals("Twitter", maxSocialPublisher);
        Assertions.assertEquals("Snapchat", tommySocialPublisher);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User johny = new Millenials("Johny");

        //When
        String johnySocialPublisher = johny.sharePost();
        System.out.println("Johny uses: " + johnySocialPublisher);
        johny.setSocialPublisher(new SnapchatPublisher());
        johnySocialPublisher = johny.sharePost();
        System.out.println("Johny now uses: " + johnySocialPublisher);

        //Then
        Assertions.assertEquals("Snapchat", johnySocialPublisher);
    }
}
