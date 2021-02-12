package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook ("Harry Potter", "J.K. Rowling");
        System.out.println(BookManager.getQuantityOfBook());
        Book book2 = BookManager.createBook ("Harry Potter", "J.K. Rowling");
        System.out.println(BookManager.getQuantityOfBook());
        Book book3 = BookManager.createBook ("Home", "R. Zayn");
        System.out.println(BookManager.getQuantityOfBook());

        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());
        System.out.println(book3.getTitle());
        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
        System.out.println(book1.equals(book3));
    }
}
