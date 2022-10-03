package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Book theGodfather = new Book("The Godfather", "Mario Puzo", LocalDate.of(1969, Month.MARCH, 10));
        Book greenMile = new Book("Green Mile", "Stephan King", LocalDate.of(1996, Month.AUGUST, 29));
        Book it = new Book("It", "Stephan King", LocalDate.of(1986, Month.SEPTEMBER, 15));

        Library library = new Library("Project number 1");
        library.getBooks().add(theGodfather);
        library.getBooks().add(greenMile);
        library.getBooks().add(it);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(it);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assertions.assertEquals(2, library.getBooks().size());
        Assertions.assertEquals(2, clonedLibrary.getBooks().size());
        Assertions.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
