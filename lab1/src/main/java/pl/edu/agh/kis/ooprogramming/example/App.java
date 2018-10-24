package pl.edu.agh.kis.ooprogramming.example;

import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
    public static void main(String[] args) {
        App application = new App();
        log.info("Value retruned from library is: {}", application.library.someLibraryMethod());
    }

    private static final Logger log =  LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private Library library = new Library();
} 
