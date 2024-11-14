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

    public boolean equals(Object other) {
        if(this.getClass() != other.getClass()){
            return false;
        }
        Book idiot = (Book) other;
        return name.equals(idiot.name);
    }
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
    public String toString(){
        return "Название -  " + name + " Год - " + year + " Автор " + author;
    }

}