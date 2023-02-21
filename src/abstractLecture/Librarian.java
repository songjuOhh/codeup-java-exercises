package abstractLecture;

public class Librarian extends Person implements Interface {

    @Override
    public void isEmployer(String user) {
        System.out.printf("Today's employer is %s", user);
        System.out.println();
    }

    @Override
    public void isOpenFor(int hours) {
        System.out.printf("Today the library is open for %s hours.",hours);
        System.out.println();
    }

    @Override
    public boolean isOpen(int hour) {
        if(hour<=1700 && hour>=800){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isClean(boolean clean) {
        if (clean){
            System.out.println("The place is clean");
            return true;
        }else{
            System.out.println("The place is not clean");
            return false;
        }
    }


    @Override
    public void isDrinking(String drink) {
        System.out.printf("is drinking %s", drink);
        System.out.println();

    }

    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        librarian.isEmployer("Songju");
        librarian.isClean(true);
        librarian.isOpen(1500);
        librarian.isOpenFor(8);
        librarian.isDrinking("Coffee");
    }
}
