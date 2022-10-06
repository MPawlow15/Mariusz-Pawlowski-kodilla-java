package com.kodilla.spring.portfolio;

import java.util.LinkedList;
import java.util.List;

public class TaskList {
    private final List<String> tasks = new LinkedList<>();

    public List<String> getTasks() {
        return tasks;
    }


}
