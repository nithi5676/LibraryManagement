package libraryManagement;

class LibraryItem {
    private int id;
    String title;
    int year;

    void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String ItemData() {
        return ("ID:" + getId() + "\n" + "Title: " + title + "\n" + "Year: " + year);
    }
}

class Book extends LibraryItem {
    String author;

    public String printAuthor() {
        return ("The Author of the book is : " + author);
    }
}

class Magazine extends LibraryItem {
    int issue;

    public String printIssue() {
        return ("Issue is: " + issue);
    }
}

public class LibraryDataManagementSystem {
    public static void main(String[] args) {
        Book book = new Book();
        Magazine magazine = new Magazine();
        book.author = "Nithish";
        book.setId(101);
        book.title = "Java Programming";
        book.year = 2002;
        magazine.issue = 2004;
        System.out.println(book.ItemData() + "\n" + book.printAuthor() + "\n" + magazine.printIssue());
    }
}