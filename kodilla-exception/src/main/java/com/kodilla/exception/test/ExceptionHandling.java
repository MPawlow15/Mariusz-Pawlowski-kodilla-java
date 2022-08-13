package com.kodilla.exception.test;

public class ExceptionHandling {
    public void probablyIWillThrowException(double x, double y) throws ExceptionHandingException{
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2,1.5);
            System.out.println("OK" + result);
        } catch (Exception e) {
            System.out.println("CATCH: Bad data! " + e);
        } finally {
            System.out.println("Finish!");
        }
    }
}
