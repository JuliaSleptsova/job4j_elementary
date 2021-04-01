package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book javaScript = new Book("JavaScript", 200);
        Book java = new Book("Java", 329);
        Book swift = new Book("Swift", 120);
        Book cleanCode = new Book("CleanCode", 100);
        Book[] library = new Book[4];
        library[0] = javaScript;
        library[1] = java;
        library[2] = swift;
        library[3] = cleanCode;
        for (int i = 0; i < library.length; i++) {
            Book book = library[i];
            System.out.println(book.getName() + " - " + book.getCountPages());
        }
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        for (int i = 0; i < library.length; i++) {
            Book book = library[i];
            System.out.println(book.getName() + " - " + book.getCountPages());
        }
        for (int i = 0; i < library.length; i++) {
            Book book = library[i];
            if (book.getName().equals("CleanCode")) {
                System.out.println(book.getName() + " - " + book.getCountPages());
            }
        }
    }
}
