import java.util.Scanner;

class Payment {
    private String cardNumber;
    private  String cardHolderName;
    private  String expiryDate;
    private String cvv;
    private double amount;

    public Payment(String cardNumber, String cardHolderName, String expiryDate, String cvv, double amount) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.amount = amount;
    }

    public boolean validateDetails() {
        if (cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            System.out.println("Invalid card number. Must be 16 digits.");
            return false;
        }
        if (cvv.length() != 3 || !cvv.matches("\\d+")) {
            System.out.println("Invalid CVV. Must be 3 digits.");
            return false;
        }
        System.out.println("Payment details validated.");
        return true;
    }

    public void processPayment() {
        if (validateDetails()) {
            System.out.println("Processing payment of $" + amount + "...");
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed due to invalid details.");
        }
    }
}



