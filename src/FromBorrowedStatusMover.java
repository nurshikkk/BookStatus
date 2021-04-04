public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE -> book.status = Status.AVAILABLE;
            case ARCHIVED -> book.status = Status.ARCHIVED;
            case OVERDUED -> book.status = Status.OVERDUED;
        }
    }
}