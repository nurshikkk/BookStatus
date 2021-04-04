public class Main {
    public static void main(String[] args) {
        Book book = new Book("War and Peace");
        BookMover bookMover = new FromAvailableStatusMover();
        BookMover bookMover2 = new FromArchivedStatusMover();
        BookMover bookMover3 = new FromBorrowedStatusMover();
        BookMover bookMover4 = new FromOverduedStatusMover();

        bookMover.moveToStatus(book, Status.ARCHIVED);
        bookMover2.moveToStatus(book, Status.AVAILABLE);
        bookMover.moveToStatus(book, Status.BORROWED);
        bookMover3.moveToStatus(book, Status.OVERDUED);
        bookMover4.moveToStatus(book, Status.AVAILABLE);

        System.out.println(book.getStatus());
    }
}