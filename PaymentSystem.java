import java.util.Scanner;
public class PaymentSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get payment details from the user
        System.out.println("Enter card number (16 digits): ");
        String cardNumber = scanner.nextLine();
        System.out.println("Enter card holder's name: ");
        String cardHolderName = scanner.nextLine();
        System.out.println("Enter expiry date (MM/YY): ");
        String expiryDate = scanner.nextLine();
        System.out.println("Enter CVV (3 digits): ");
        String cvv = scanner.nextLine();
        System.out.println("Enter amount to pay: ");
        double amount = scanner.nextDouble();

        // Create Payment object and process payment
        Payment payment = new Payment(cardNumber, cardHolderName, expiryDate, cvv, amount);
        payment.processPayment();

        scanner.close();
    }
}
