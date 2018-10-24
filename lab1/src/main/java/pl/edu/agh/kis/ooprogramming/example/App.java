package pl.edu.agh.kis.ooprogramming.example;


public class App {
    public static void main(String[] args) {
        App application = new App();
        System.out.println("Value retruned from library is: " + application.library.someLibraryMethod());
    }

    private Library library = new Library();
} 
