package pl.edu.agh.kis.ooprogramming.example;

import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class LibraryTest {

    //pure junit test
    @Test
    public void someLibraryMethodReturnsTrue() {
        //setup:
        Library lib = new Library();

        //when:
        boolean result = lib.someLibraryMethod();

        //then:
        assertFalse(result);
    }
}
