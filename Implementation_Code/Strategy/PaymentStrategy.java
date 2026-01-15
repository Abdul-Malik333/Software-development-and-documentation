/**
 * Strategy interface for different payment methods.
 */
public interface PaymentStrategy {

    /**
     * Pay a given amount using a specific strategy.
     *
     * @param amount amount to pay
     * @return payment result message
     */
    String pay(double amount);
}
