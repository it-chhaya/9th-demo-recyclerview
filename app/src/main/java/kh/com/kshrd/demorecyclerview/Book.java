package kh.com.kshrd.demorecyclerview;

public class Book {

    private int id;
    private int image;
    private String title;

    public Book() {

    }

    public Book(int id, int image, String title) {
        this.id = id;
        this.image = image;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", image=" + image +
                ", title='" + title + '\'' +
                '}';
    }

}
