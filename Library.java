package Librari;

import java.util.ArrayList;

public class Library {
    public String name;
    public ArrayList<Book> books;

    public void addBook(Book book) {
        if(books==null){
            System.out.println("Book is null");
            books=new ArrayList<>();
        }
        books.add(book);
    }
    public void getBookbyAuthtor(Author author) {
boolean uGjet=false;
for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                uGjet=true;
                System.out.println(book);
            }
        }if(!uGjet){
            System.out.println("Book not found");
        }
    }


}
