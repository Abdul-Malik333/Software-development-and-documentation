/**
 * Concrete Strategy: Credit Card payment.
 */
public class CreditCardPayment implements PaymentStrategy {

    /** {@inheritDoc} */
    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using Credit Card.";
    }
}
