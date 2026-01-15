import javax.swing.*;
import java.awt.*;

/**
 * Simple front-end UI example for a Shopping Cart system.
 * This class demonstrates basic UI components using Java Swing.
 *
 * Note: This code is provided for demonstration purposes only
 * and is not required to be executed.
 */
public class SimpleCartUI extends JFrame {

    /**
     * Creates the shopping cart user interface.
     */
    public SimpleCartUI() {
        setTitle("Shopping Cart UI");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Shopping Cart", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));

        JTextArea cartArea = new JTextArea();
        cartArea.setText("Items in Cart:\n- Meal Plan\n- Laundry Service");
        cartArea.setEditable(false);

        JButton addButton = new JButton("Add Item");
        JButton checkoutButton = new JButton("Checkout");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(checkoutButton);

        add(titleLabel, BorderLayout.NORTH);
        add(new JScrollPane(cartArea), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}
