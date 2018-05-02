public interface Clickable {
    void click();

    default void showOff() {
        System.out.print("I'm clickable!");
    }
}

public interface Focusable {
    void click();

    default void showOff() {
        System.out.print("I'm Focusable!");
    }
}

public class Button implements Clickable, Focusable{
    @Override
    public void click() {

    }

    // because the two interfaces has same default method, you must Override it
    @Override
    public void showOff() {

    }

}
