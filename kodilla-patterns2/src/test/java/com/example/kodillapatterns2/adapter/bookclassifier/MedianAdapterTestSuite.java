package com.example.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
            //Given
            Book book1 = new Book("Author", "Title", 1975, "Sigature");
            Book book2 = new Book("Author", "Title", 1980, "Sigature");
            Book book3 = new Book("Author", "Title", 2000, "Sigature");
            Book book4 = new Book("Author", "Title", 2020, "Sigature");
            Book book5 = new Book("Author", "Title", 2022, "Sigature");
            Set<Book> bookSet = new HashSet<>();
            bookSet.add(book1);
            bookSet.add(book2);
            bookSet.add(book3);
            bookSet.add(book4);
            bookSet.add(book5);
            MedianAdapter medianAdapter = new MedianAdapter();
            //When
            int median = medianAdapter.publicationYearMedian(bookSet);
            //Then
            assertEquals(2000, median);
    }
}
