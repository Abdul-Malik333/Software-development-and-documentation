/**
 * Context class that uses a PaymentStrategy.
 */
public class PaymentContext {

    private PaymentStrategy strategy;

    /**
     * Sets the payment strategy.
     *
     * @param strategy chosen payment strategy
     */
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Executes payment using the selected strategy.
     *
     * @param amount amount to pay
     * @return result message
     */
    public String executePayment(double amount) {
        return strategy.pay(amount);
    }
}
