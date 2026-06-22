class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void calculateAverageBill(double totalBill, int items) {
        try {
            double average = totalBill / items;
            System.out.println("Average Cost Per Item: ₹" + average);
        } catch (ArithmeticException e) {
            System.out.println("Billing Error: Number of items cannot be zero.");
        }
    }

    public static void getPatient(String[] patients, int index) {
        try {
            System.out.println("Patient Found: " + patients[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Patient Error: Invalid patient index.");
        }
    }

    public static void parseBillAmount(String input) {
        try {
            int amount = Integer.parseInt(input);
            System.out.println("Bill Amount Entered: ₹" + amount);
        } catch (NumberFormatException e) {
            System.out.println("Input Error: Please enter a valid numeric amount.");
        }
    }

    public static void makePayment(double billAmount, double availableFunds)
            throws InsufficientFundsException {

        if (availableFunds < billAmount) {
            throw new InsufficientFundsException(
                    "Payment Failed: Insufficient funds. Required ₹"
                            + billAmount + ", Available ₹" + availableFunds);
        }

        System.out.println("Payment Successful. Amount Paid: ₹" + billAmount);
    }

    public static void main(String[] args) {

        System.out.println("=== Billing Calculation ===");
        calculateAverageBill(5000, 0);

        System.out.println("\n=== Patient Lookup ===");
        String[] patients = {"Rahul", "Priya", "Aman"};
        getPatient(patients, 5);

        System.out.println("\n=== Bill Entry ===");
        parseBillAmount("12A5");

        System.out.println("\n=== Payment Processing ===");
        try {
            makePayment(10000, 5000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nSystem running normally...");
    }
}