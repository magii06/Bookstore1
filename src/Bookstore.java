import java.util.ArrayList;

public class Bookstore {
    ArrayList<Book> books=new ArrayList<>();
    public void sell (Book book) {
        int ab=book.getAvailable();
        if(ab>0) {
            System.out.println("Заглавие на книгата: " + book.getTitle() + "автор: " + book.author.getName() + "цена : " + book.getPrice() + "лева.");
        book.setAvailable(ab-1);
        }
        if(ab<=0) {
            System.out.println("Книгата не е в наличност :( .");
        }
    }
}
