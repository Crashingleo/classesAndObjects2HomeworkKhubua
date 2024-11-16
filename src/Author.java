import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    //Создадим конструктор
    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    //Создадим геттеры и сеттеры для Name

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Создадим геттеры и сеттеры для Surname
    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String toString(){
        return "Имя " + this.name + " " + this.surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}