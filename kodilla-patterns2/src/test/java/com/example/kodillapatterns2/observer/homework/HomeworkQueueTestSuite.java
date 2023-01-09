package com.example.kodillapatterns2.observer.homework;

import com.kodilla.patterns2.observer.homework.Mentor;
import com.kodilla.patterns2.observer.homework.Worksheet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkQueueTestSuite {

    @Test
    public void testUpdate() {
        // Given
        Worksheet homework1 = new Worksheet("Ryszard");
        Worksheet homework2 = new Worksheet("Alina");
        Worksheet homework3 = new Worksheet("Maciej");
        Mentor mentor1 = new Mentor("Stefan");
        Mentor mentor2 = new Mentor("Renata");
        homework1.registerObserver(mentor1);
        homework2.registerObserver(mentor2);
        homework3.registerObserver(mentor2);
        // When
        homework1.addHomework("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        homework2.addHomework("in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        homework3.addHomework("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        homework2.addHomework("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium");
        homework1.addHomework("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium");
        // Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());
    }
}
