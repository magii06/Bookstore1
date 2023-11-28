package com.company;

import java.util.ArrayList;

public class Bookstore {
    ArrayList<Book> books;

    public Bookstore() {
        this.books=new ArrayList<>();
    }
    public Bookstore(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void sell (Book book) {
        int ab=book.getAvailable();
        if(ab>0) {
            //System.out.println("Заглавие на книгата: " + book.getTitle() + "автор: " + book.author.getName() + "цена : " + book.getPrice() + "лева.");
            System.out.println("Книга"+book.toString()+"продава се на цена "+book.getPrice());
        book.setAvailable(ab-1);
        }
        if(ab<=0) {
            System.out.println("Книгата не е в наличност :( .");
        }
    }
}
