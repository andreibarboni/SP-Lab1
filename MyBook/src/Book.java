public class Book {
    public String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String print() {
        return "Titlu ='" + title;
    }

    public void createNewParagraph(String paragraph){
        System.out.println(paragraph);
    }

    public void createNewImage(String img){
        System.out.println(img);
    }

    public void createNewTable(String table){
        System.out.println(table);
    }
}
