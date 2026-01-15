/**
 * Concrete Strategy: Cash payment.
 */
public class CashPayment implements PaymentStrategy {

    /** {@inheritDoc} */
    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using Cash.";
    }
}
