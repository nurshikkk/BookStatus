public class Book {
    public String title;
    public Status status = Status.AVAILABLE;

    public Book(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }
}