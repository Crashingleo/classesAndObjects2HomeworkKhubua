import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Leonid", "Leonidov");
        Author secondAuthor = new Author("Ilya", "Leonidov");
        Book idiot = new Book("Idiot", 1000, author);
        Book notIdiot = new Book("NotIdiot", 1010, secondAuthor);
        idiot.setYear(1005);
        System.out.println(idiot.getAuthor());
    }

}