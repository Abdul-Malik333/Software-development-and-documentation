import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Simple unit test example using JUnit.
 * This test demonstrates basic testing for Part 3.
 */
public class CartTest {

    /**
     * Tests a simple calculation.
     */
    @Test
    public void testTotalCalculation() {
        double price = 15.0;
        int quantity = 2;
        double total = price * quantity;

        Assertions.assertEquals(30.0, total);
    }
}
