package Librari;

public class Book {
    private String id;
    private String title;
    private Author author;

    public Book(String id, String title, Author author) {
        if(id == null || id.isEmpty()){
            throw new IllegalArgumentException("ID cannot be null or empty");
        }
        this.id = id;

        if(title == null || title.isEmpty()){
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;

        this.author = author;
    }

    public String getId() {
        return id;
    }

    public Author getAuthor(){
        return author;
    }

    @Override
    public String toString() {
        return "\nBook title: " + title + "\nBook ID: " + id + "\nBook's Author: " + author;
    }
}