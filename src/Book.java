import java.util.Objects;

public class Book {
    private String name;
    // private ограничивает доступ к имени из вне. Объявление имени книги в классе Book.
    private int year;
    // ограничение доступа к году публикации книги
    private Author author;
    // Переменная автор с классом автор.

    //создадим конструктор для класса Book
    public Book(String name, int year, Author author){
        this.name = name;
        this.year = year;
        this.author = author;
    }
    //Создадим геттеры и сетеры для Name
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    //Создадим геттеры и сеттеры для YEAR
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }

    //Создадим геттеры и сеттеры для author
    public Author getAuthor(){
        return this.author;
    }
    public void setAuthor(Author author){
        this.author = author;
    }




    public String toString(){
        return "Название -   " + name + " Год - " + year + " Автор " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, author);
    }
}