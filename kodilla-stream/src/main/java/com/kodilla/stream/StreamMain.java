package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> par = forum.getForumUsers().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, fu -> fu));

        par.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}