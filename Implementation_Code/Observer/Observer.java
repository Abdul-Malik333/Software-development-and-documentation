/**
 * Observer interface for receiving updates from a Subject.
 */
public interface Observer {

    /**
     * Called when the subject state changes.
     *
     * @param message update message
     */
    void update(String message);
}
