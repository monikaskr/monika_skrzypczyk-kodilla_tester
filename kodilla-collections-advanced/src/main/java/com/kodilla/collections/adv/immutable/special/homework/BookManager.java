package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookManager {

    static Set<Book> books = new HashSet<>();

    public static Book createBook(String title, String author){
        Book book = new Book (title, author);
        books.add(book);
        return book;
    }
    public static int getQuantityOfBook(){
        return books.size();
    }
}