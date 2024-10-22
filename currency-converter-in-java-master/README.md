# currency-converter-in-java


Currency converter (or currency exchange) is a mini project coded in Java programming language. This simple application provides a web-based interface for exchanging/converting money from one currency (say $) to another currency (say €).

The complete source code of currency exchange application can be downloaded from the link below. As this is just a mini project, project report and documentation are not available. You can go through the description below for project abstract.

Currency Converter Project Abstract:
Different countries use different currency, and there is daily variation in these currencies relative to one another. Those who transfer money from one country to another (one currency to another) must be updated with the latest currency exchange rates in the market.

Currency converter mini project is built keeping this thing in mind. It is simply a calculator-like app developed using Ajax, Java servlets web features. In this application, there is regular update about currency of every country by which it displays present currency market value and conversion rate.

Such application can be used by any user, but it is mainly useful for business, shares, and finance related areas where money transfer and currency exchange takes place on a daily basis.

In this currency converter app, users are provided with an option to select the type of conversion, i.e. from “this” currency to “that” currency. This simple feature allows users to enter amount to be converted (say currency in Dollars), and display the converted amount (say currency in Euro).



visit more projects - https://projectworlds.in

demo- https://www.projectworlds.in/java-projects-with-source-code/currency-converter-java-mini-project/



System Architecture
1. User Interface (UI) Layer:

MainWindow Class:

Responsible for the main application window, including setting up the GUI components like labels, combo boxes, text fields, and buttons.

Manages user interactions and triggers events based on user actions (e.g., button clicks).

AboutWindow Class:

Displays the 'About' information of the application.

2. Application Logic Layer:

Currency Class:

Represents the currency, including its name, short name, and exchange values.

Handles setting default exchange values and provides getter and setter methods for currency attributes.

CurrencyConverter Class:

Contains the main method to start the application.

Sets the look and feel of the application and initializes the MainWindow.

3. Utility Classes:

JTextFieldLimit Class:

Extends PlainDocument to limit the number of characters in text fields and optionally convert text to uppercase.

4. Resource Management:

ResourceBundle:

Manages localization and provides translations for different UI components.

5. Integration and Interaction:

The UI Layer interacts with the Application Logic Layer to process user inputs and perform currency conversions.

The Utility Classes support the UI by enforcing text field constraints.

Resource Management ensures that the application can support multiple languages and localizations.

By organizing your system into these components, you ensure a clean and maintainable codebase that's easy to extend and modify.


+--------------------+
|  CurrencyConverter |
+--------------------+
| + main()           |
+--------------------+
        |
        |
       V
+--------------------+
|   MainWindow       |
+--------------------+
| - contentPane      |
| - fieldAmount      |
| - currencies       |
| + MainWindow()     |
| + populate()       |
| + convert()        |
+--------------------+
        |
        |
       V
+--------------------+
|   AboutWindow      |
+--------------------+
| - contentPane      |
| + AboutWindow()    |
| + getInstance()    |
+--------------------+
        |
        |
       V
+--------------------+
|   Currency         |
+--------------------+
| - name             |
| - shortName        |
| - exchangeValues   |
| + Currency()       |
| + getName()        |
| + getShortName()   |
| + getExchangeValues() |
| + defaultValues()  |
| + init()           |
| + convert()        |
+--------------------+
        |
        |
       V
+--------------------+
| JTextFieldLimit    |
+--------------------+
| - limit            |
| - toUppercase      |
| + JTextFieldLimit()|
| + insertString()   |
+--------------------+
