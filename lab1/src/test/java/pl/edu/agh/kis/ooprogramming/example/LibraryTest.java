package pl.edu.agh.kis.ooprogramming.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class LibraryTest {

    //pure junit test
    @Test
    public void someLibraryMethodReturnsTrueWithPureJunit() {
        //setup:
        Library lib = new Library();

        //when:
        boolean result = lib.someLibraryMethod();

        //then:
        assertFalse(result);
    }

    //assertJ test
    @Test
    public void someLibraryMethodReturnsTrueWithAssertJ() {
        //setup:
        Library lib = new Library();

        //expect:
        assertThat(lib.someLibraryMethod()).isFalse();
    }

}
