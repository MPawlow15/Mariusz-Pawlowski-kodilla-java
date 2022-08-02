package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForum= new  ArrayList<>();

    public Forum() {
        theForum.add(new ForumUser(001, "Tom", 'M', "1999-11-02", 5));
        theForum.add(new ForumUser(002, "Lucy", 'F', "2000-03-21", 12));
        theForum.add(new ForumUser(003, "Max", 'M', "1997-10-12", 65));
        theForum.add(new ForumUser(004, "Anthony", 'M', "1989-02-28", 75));
        theForum.add(new ForumUser(005, "Edd", 'M', "1995-12-24", 11));
    }
    public List<ForumUser> getForumUsers() {
        return theForum;
    }
}
