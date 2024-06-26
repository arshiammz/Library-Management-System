import java.io.Serial;
import java.util.UUID;
import java.io.Serializable;

public class Book implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String bookID;
    private String title;
    private String author;
    private boolean availability;
    private String description;
    static int currentID = 0;

    public Book(String title, String author, String description) {
        currentID ++;
        this.bookID = String.valueOf(currentID);
        this.title = title;
        this.author = author;
        this.description = description;
        this.availability = true;
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", bookID='" + getBookID() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", availability=" + isAvailability() +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}

