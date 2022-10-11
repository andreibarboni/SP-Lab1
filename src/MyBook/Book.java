package MyBook;

public class Book {
    public String title;

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("\n" + "The title of the book is " + title);
    }

    public void createNewParagraph(String para) {
        System.out.println("\n" + para);
    }

    public void createNewImage(String img) {
        System.out.println("\n" + img);
    }

    public void createNewTable(String tbl) {
        System.out.println("\n" + tbl);
    }
}
