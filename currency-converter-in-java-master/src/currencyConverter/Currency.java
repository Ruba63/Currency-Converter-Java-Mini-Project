package currencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
    private String name; // Full name of the currency
    private String shortName; // Short name (abbreviation) of the currency
    private HashMap<String, Double> exchangeValues = new HashMap<String, Double>(); // Exchange rates for this currency

    // Constructor to initialize a Currency object with name and short name
    public Currency(String nameValue, String shortNameValue) {
        this.name = nameValue;
        this.shortName = shortNameValue;
    }

    // Getter for the full name of the currency
    public String getName() {
        return this.name;
    }

    // Setter for the full name of the currency
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the short name of the currency
    public String getShortName() {
        return this.shortName;
    }

    // Setter for the short name of the currency
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    // Getter for the exchange values (exchange rates)
    public HashMap<String, Double> getExchangeValues() {
        return this.exchangeValues;
    }

    // Setter for a specific exchange value
    public void setExchangeValues(String key, Double value) {
        this.exchangeValues.put(key, value);
    }

    // Method to set default exchange values for commonly used currencies
    public void defaultValues() {
        String currency = this.name;

        switch (currency) {    
            case "US Dollar":
                this.exchangeValues.put("USD", 1.00);
                this.exchangeValues.put("EUR", 0.93);
                this.exchangeValues.put("GBP", 0.66);
                this.exchangeValues.put("CHF", 1.01);
                this.exchangeValues.put("CNY", 6.36);
                this.exchangeValues.put("JPY", 123.54);
                break;
            case "Euro":
                this.exchangeValues.put("USD", 1.073);
                this.exchangeValues.put("EUR", 1.00);
                this.exchangeValues.put("GBP", 0.71);
                this.exchangeValues.put("CHF", 1.08);
                this.exchangeValues.put("CNY", 6.83);
                this.exchangeValues.put("JPY", 132.57);
                break;
            case "British Pound":
                this.exchangeValues.put("USD", 1.51);
                this.exchangeValues.put("EUR", 1.41);
                this.exchangeValues.put("GBP", 1.00);
                this.exchangeValues.put("CHF", 1.52);
                this.exchangeValues.put("CNY", 9.60);
                this.exchangeValues.put("JPY", 186.41);
                break;
            case "Swiss Franc":
                this.exchangeValues.put("USD", 0.99);
                this.exchangeValues.put("EUR", 0.93);
                this.exchangeValues.put("GBP", 0.66);
                this.exchangeValues.put("CHF", 1.00);
                this.exchangeValues.put("CNY", 6.33);
                this.exchangeValues.put("JPY", 122.84);
                break;
            case "Chinese Yuan Renminbi":
                this.exchangeValues.put("USD", 0.16);
                this.exchangeValues.put("EUR", 0.15);
                this.exchangeValues.put("GBP", 0.11);
                this.exchangeValues.put("CHF", 0.16);
                this.exchangeValues.put("CNY", 1.00);
                this.exchangeValues.put("JPY", 19.41);
                break;
            case "Japanese Yen":
                this.exchangeValues.put("USD", 0.008);
                this.exchangeValues.put("EUR", 0.007);
                this.exchangeValues.put("GBP", 0.005);
                this.exchangeValues.put("CHF", 0.008);
                this.exchangeValues.put("CNY", 0.051);
                this.exchangeValues.put("JPY", 1.000);
                break;
        }
    }

    // Method to initialize a list of currencies with default values
    public static ArrayList<Currency> init() {
        ArrayList<Currency> currencies = new ArrayList<Currency>();
        
        // Adding common currencies to the list
        currencies.add(new Currency("US Dollar", "USD"));
        currencies.add(new Currency("Euro", "EUR"));
        currencies.add(new Currency("British Pound", "GBP"));
        currencies.add(new Currency("Swiss Franc", "CHF"));
        currencies.add(new Currency("Chinese Yuan Renminbi", "CNY"));
        currencies.add(new Currency("Japanese Yen", "JPY"));
        
        // Setting default exchange values for each currency
        for (Integer i = 0; i < currencies.size(); i++) {
            currencies.get(i).defaultValues();
        }        
        
        return currencies; // Return the list of currencies
    }

    // Static method to convert an amount from one currency to another
    public static Double convert(Double amount, Double exchangeValue) {
        Double price;
        price = amount * exchangeValue; // Calculate the converted amount
        price = Math.round(price * 100d) / 100d; // Round to two decimal places
        
        return price; // Return the converted price
    }
}
