package abstractLecture;

public class Patron extends Person implements Interface {
    @Override
    public void isEmployer(String user) {

    }

    @Override
    public void isOpenFor(int hours) {

    }

    @Override
    public boolean isOpen(int hour) {
        return false;
    }

    @Override
    public boolean isClean(boolean clean) {
        return false;
    }

    @Override
    public void isDrinking(String drink) {

    }
}
