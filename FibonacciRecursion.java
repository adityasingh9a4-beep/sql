import java.util.Scanner;

public class FibonacciRecursion {

    public static int getFibonacci(int n) {
        if (n <= 1) {
            if (n < 0) return 0;
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt(); 
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
        
        scanner.close();
    }
}
