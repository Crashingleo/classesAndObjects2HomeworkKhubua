import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("leonid", "leonidov");
        Author secondAuthor = new Author("ilya", "leonidov");
        Book idiot = new Book("idiot", 1000, author);
        Book notIdiot = new Book("notIdiot", 1010, secondAuthor);
        idiot.setYear(1005);
        System.out.println(idiot.getAuthor());
    }

}