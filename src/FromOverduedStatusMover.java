public class FromOverduedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE -> book.status = Status.AVAILABLE;
            case BORROWED -> System.out.println("Book transition from status" + " " + "'" + book.status + "'" + " " + "to status" + " " + "'" + Status.BORROWED + "'" + " " + "rejected");
            case ARCHIVED -> book.status = Status.ARCHIVED;
        }
    }
}