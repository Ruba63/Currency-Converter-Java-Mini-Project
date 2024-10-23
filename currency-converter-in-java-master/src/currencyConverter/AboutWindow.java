package currencyConverter;

// Importing necessary libraries
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.net.URI;
import java.util.ResourceBundle;

public class AboutWindow extends JFrame {
    // Bundle for handling localization (translations)
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("localization.translation"); //$NON-NLS-1$
    
    // Panel that holds all components
    private JPanel contentPane;
    
    // Singleton instance of AboutWindow
    private static AboutWindow windowInstance = null;

    /**
     * Private constructor to create the 'About' window
     */
    private AboutWindow() {
        // Set the window title using the localized string from the bundle
        setTitle(BUNDLE.getString("AboutWindow.this.title")); //$NON-NLS-1$
        
        // Set window size and position
        setBounds(100, 100, 347, 260);
        setLocationRelativeTo(null);
        
        // Make the window non-resizable
        setResizable(false);

        // Initialize the content panel with padding
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        
        // Set the content pane for this frame
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Label for the title of the software
        JLabel lblTitle = new JLabel("Currency Converter");
        lblTitle.setBounds(65, 12, 219, 33);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 15));
        contentPane.add(lblTitle);

        // Label for software version
        JLabel lblVersion = new JLabel("Version 1.0");
        lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
        lblVersion.setBounds(65, 45, 219, 33);
        contentPane.add(lblVersion);

        // Label for license information
        JLabel lblLicenceMit = new JLabel("Licence GNU GPL v3.0");
        lblLicenceMit.setBounds(65, 77, 219, 33);
        lblLicenceMit.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblLicenceMit);

        // Label for the author information
        JLabel lblAuthor = new JLabel(BUNDLE.getString("AboutWindow.lblAuthor.text")); //$NON-NLS-1$
        lblAuthor.setHorizontalAlignment(SwingConstants.CENTER);
        lblAuthor.setBounds(65, 122, 219, 33);
        contentPane.add(lblAuthor);

        // Label with a clickable hyperlink
        JLabel lblLink = new JLabel("http://jvinceno.fr");
        lblLink.setBounds(65, 159, 219, 33);
        lblLink.setHorizontalAlignment(SwingConstants.CENTER);
        lblLink.setForeground(Color.BLUE);
        
        // Set the cursor to hand when hovering over the link
        lblLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Add a mouse listener to open the link in the default web browser
        lblLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    // Open the specified URL in the default browser
                    Desktop.getDesktop().browse(new URI("http://www.jvinceno.fr"));
                } catch (Exception ex) {
                    // Print stack trace in case of an error
                    ex.printStackTrace();
                }
            }
        });
        
        // Add the link label to the content pane
        contentPane.add(lblLink);
    }

    /**
     * Method to get the singleton instance of AboutWindow
     * Ensures only one instance of the window is created
     */
    public static AboutWindow getInstance() {
        if (windowInstance == null) {
            windowInstance = new AboutWindow();
        }
        return windowInstance;
    }
}
