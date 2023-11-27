import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Bookstore bkst=new Bookstore();
        int numBooks=scanner.nextInt();
        System.out.println("Списък с книги: ");
        for (int i=0; i<numBooks; i++){
            Book book = null;
            System.out.println("Въведете заглавие: ");
            String title = scanner.next();
            System.out.println("Въведете име на автора: ");
            String authorName = scanner.next();
            System.out.println("Въведете възраст на автора: ");
            String authorAge = scanner.next();
            System.out.println("Въведете тип книга <Children/Book/Comic> : ");
            BookType type = BookType.valueOf(scanner.next().toUpperCase());

            switch (type) {
                case CHILDREN_BOOK -> {

                    book = new ChildrenBook();
                    break;
                }
                case COMIC_BOOK -> {

                    book = new ComicBook();
                    break;
                }
                case BOOK -> {
                    book = new Book();
                }

            }
            book.setType(type);
            book.setTitle(scanner.next());
            book.setAuthor(scanner.next(), scanner.nextInt());
            book.setPrice(scanner.nextDouble());
            book.setAvailable(scanner.nextInt());
            switch (type) {
                case COMIC_BOOK -> {
                    System.out.println("Името на героя е: ");
                    ((ComicBook) book).setCharacterName(scanner.next());
                }
                case CHILDREN_BOOK -> {
                    System.out.println("Книгата е подходяща за деца на възраст от: ");
                    ((ChildrenBook) book).setAge(scanner.nextInt());
                }
                default -> {
                }
            }
            bkst.books.add(book);
        }
    
     System.out.println("Продадени книги: ");
    for(int i=0; i<bkst.books.size(); i++) {
        if (i%2 == 0) {
            bkst.sell(bkst.books.get(i));
        }
    }
    }
}