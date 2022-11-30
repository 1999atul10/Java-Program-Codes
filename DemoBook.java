class Book {
    private String title;
    private int noOfPages;

    // getter for title
    public String getTitle() {
        return title;
    }

    // setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {

    }
}

class TextBook extends Book {
    private String author;

    // getter for author
    public String getAuthor() {
        return author;
    }

    // setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {

    }
}
public class DemoBook {
    public static void main(String[] args) {
        System.out.println("\n\n");
        Book b1 = new Book();
        b1.setTitle("Head First JAVA");
        System.out.println("Title of the book is " + b1.getTitle());

        System.out.println("\n");

        TextBook t1 = new TextBook();
        t1.setTitle("Space and Time");
        t1.setAuthor("Stephen Hawking");
        System.out.println("Title of the book is " + t1.getTitle());
        System.out.println("Author of the book is " + t1.getAuthor());
        System.out.println("\n\n");
    }
}
