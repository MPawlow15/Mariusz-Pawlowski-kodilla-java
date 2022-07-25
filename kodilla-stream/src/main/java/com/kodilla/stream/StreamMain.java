package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Man",(text -> text + "ACD"));
        poemBeautifier.beautify("Train",(text -> "QWE" + text));
        poemBeautifier.beautify("Desk",(text -> text.toUpperCase()));
        poemBeautifier.beautify("Hello",(text -> text.replace('l', 'p')));
        poemBeautifier.beautify("Bike",(text -> text.toLowerCase()));

    }
}