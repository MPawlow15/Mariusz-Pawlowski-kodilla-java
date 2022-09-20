package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public boolean inform(User user) {

        System.out.println("Mail will be sent to: " + user.name + user.lastName);

        return true;
    }
}
