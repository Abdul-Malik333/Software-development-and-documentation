import java.util.ArrayList;
import java.util.List;

/**
 * ShoppingCart is the Subject in the Observer Pattern.
 * When an item is added, all observers are notified.
 */
public class ShoppingCart implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int itemsCount = 0;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    /**
     * Adds an item to the cart and notifies observers.
     */
    public void addItem() {
        itemsCount++;
        notifyObservers("Cart updated. Items count = " + itemsCount);
    }
}
