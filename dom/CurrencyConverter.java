import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Currency Converter =====");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. GBP");
        System.out.println("4. EUR");

        System.out.print("Enter the currency you have: ");
        int from = sc.nextInt();

        System.out.print("Enter the currency you want: ");
        int to = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double inr = 0;
        double result = 0;

        if (from == 1) {
            inr = amount;
        } else if (from == 2) {
            inr = amount * 83.50;
        } else if (from == 3) {
            inr = amount * 106.00;
        } else if (from == 4) {
            inr = amount * 90.50;
        } else {
            System.out.println("Wrong currency selected!");
            return;
        }

        if (to == 1) {
            result = inr;
        } else if (to == 2) {
            result = inr / 83.50;
        } else if (to == 3) {
            result = inr / 106.00;
        } else if (to == 4) {
            result = inr / 90.50;
        } else {
            System.out.println("Wrong currency selected!");
            return;
        }

        System.out.println("\nConverted amount: " + result);

        sc.close();






        






        
    }






    






    
}