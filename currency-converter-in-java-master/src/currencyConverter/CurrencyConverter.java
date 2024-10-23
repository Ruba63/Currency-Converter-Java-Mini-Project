package currencyConverter;

import java.awt.EventQueue;
import javax.swing.UIManager;

public class CurrencyConverter {
    public static void main(String[] args) {
        try {
            // Set the look and feel of the application to match the system's look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Throwable e) {
            e.printStackTrace(); // Print any exception to the stack trace for debugging
        }

        // Use EventQueue to ensure the creation and showing of the main window occurs on the Event Dispatch Thread
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Create and show the main window at startup
                    MainWindow mainWindow = new MainWindow();
                    mainWindow.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(); // Print any exception to the stack trace for debugging
                }
            }
        });
    }
}
