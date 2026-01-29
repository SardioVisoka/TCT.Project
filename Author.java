package Librari;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        if (name == null || surname == null || name.isEmpty() || surname.isEmpty()) {
            throw new IllegalArgumentException(
                    "Author name and surname must not be null or empty"
            );
        }
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Author{" +
                "Name: '" + name + '\'' +
                ", Surname: '" + surname + '\'' +
                '}';
    }
}
