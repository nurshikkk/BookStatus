public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case BORROWED -> book.status = Status.BORROWED;
            case ARCHIVED -> book.status = Status.ARCHIVED;
            case OVERDUED -> System.out.println("Book transition from status" + " " + "'" + book.status + "'" + " " + "to status" + " " + "'" + Status.OVERDUED + "'" + " " + "rejected");
        }
    }
}