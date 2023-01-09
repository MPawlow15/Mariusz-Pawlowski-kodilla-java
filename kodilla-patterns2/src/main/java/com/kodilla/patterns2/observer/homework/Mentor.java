package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int updateCount;

    public Mentor (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Worksheet worksheet) {
        System.out.println(name + ": New homework to check added by " + worksheet.getTraineeName() +
                " (total homework in queue: " + worksheet.getHomeworks().size());
        updateCount++;
    }
}
