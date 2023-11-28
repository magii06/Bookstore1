package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List <Book> books=new ArrayList<>();
        Bookstore bkst=new Bookstore((ArrayList<Book>) books);
        int numBooks=scanner.nextInt();
        System.out.println("Списък с книги: ");
        for (int i=0; i<numBooks; i++){
            Book book ;
            System.out.println("Въведете тип книга <Children/BOOK/Comic> : ");
            BookType type = BookType.valueOf(scanner.next().toUpperCase());
            switch (type) {
                case CHILDREN_BOOK ->  {

                    book = new ChildrenBook();
                    break;
                }
                case COMIC_BOOK -> {

                    book = new ComicBook();
                    break;
                }
                 default -> {
                    book = new Book();
                    break;
                }

            }  book.setType(type);
            System.out.println("Въведете заглавие: ");
            book.setTitle(scanner.next());
            System.out.println("Въведете име, възраст на автора, цена и наличност: ");
          Author a=new Author();
          a.setName(scanner.next());
          a.setAge(scanner.nextInt());
          book.setAuthor(a);
          book.setPrice(scanner.nextDouble());
          book.setAvailable(scanner.nextInt());
            switch (type) {
                case COMIC_BOOK -> {
                    System.out.println("Името на героя е: ");
                    ((ComicBook) book).setCharacterName(scanner.next());
                    break;
                }
                case CHILDREN_BOOK -> {
                    System.out.println("Книгата е подходяща за деца на възраст от: ");
                    ((ChildrenBook) book).setAge(scanner.nextInt());
                    break;
                }

            }
            books.add(book);
        }
    scanner.close();
     System.out.println("Продадени книги: ");
    for(int i=0; i<books.size(); i+=2) {
            bkst.sell(books.get(i));

    }
    }
}