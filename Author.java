package Librari;

public class Author {
    private String name;
    private String surname;



    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Author() {
    }
    public Author(String name, String surname) {
        if (name==null || name.isEmpty()) {
            System.out.println("Name is null");
        }else{
            this.name = name;
        }
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", surname=" + surname + '}';
    }

}

