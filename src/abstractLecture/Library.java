package abstractLecture;

public class Library extends Media {


    public Library(String bookTitle, int recordCount, boolean signed) {
        super(bookTitle, recordCount, signed);
    }

    public Library() {
        super();
    }


    @Override
    public void findBooks() {
        System.out.println("Loading the result...");
    }

    @Override
    public void deleteRecord() {
        System.out.println("Record deleted.");
    }

    @Override
    public void signature() {
        System.out.println("Signing your signature...");
    }
}
