package currencyConverter; // Package of the project

import javax.swing.text.AttributeSet; // Import AttributeSet interface to control text properties
import javax.swing.text.BadLocationException; // Import BadLocationException for handling exceptions
import javax.swing.text.PlainDocument; // Import PlainDocument to customize text documents

// JTextFieldLimit class to set input limits in JTextField
public class JTextFieldLimit extends PlainDocument {
  private int limit; // Maximum length for the input text
  private boolean toUppercase = false; // Variable to determine if the text should be converted to uppercase
  
  // Constructor that takes the length limit
  JTextFieldLimit(int limit) {
    super(); // Call the constructor of the superclass
    this.limit = limit; // Set the limit
  }
  
  // Another constructor that takes the length limit and an option for uppercase conversion
  JTextFieldLimit(int limit, boolean upper) {
    super(); // Call the constructor of the superclass
    this.limit = limit; // Set the limit
    toUppercase = upper; // Set the option to convert text to uppercase
  }
 
  // Method to insert text while checking its length
  public void insertString(int offset, String str, AttributeSet attr)
      throws BadLocationException {
    // If the input string is null, do nothing
    if (str == null) return;

    // Check if the new text length does not exceed the allowed limit
    if ((getLength() + str.length()) <= limit) {
      // If the option to convert text to uppercase is enabled, convert the string
      if (toUppercase) str = str.toUpperCase();
      // Call the insert method in the superclass to insert the text
      super.insertString(offset, str, attr);
    }
  }
}
