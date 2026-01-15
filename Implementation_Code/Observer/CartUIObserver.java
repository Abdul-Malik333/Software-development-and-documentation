/**
 * Concrete Observer: represents a UI component that reacts to cart updates.
 */
public class CartUIObserver implements Observer {

    /** {@inheritDoc} */
    @Override
    public void update(String message) {
        // In a real UI, this would update labels/total.
        System.out.println("[UI] " + message);
    }
}
