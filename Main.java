public public class Main {
    public static void main(String[] args) {

        String[] names = {
            "Aditya", "Karman", "Kartik", "Rahul", "Aman",
            "Rohan", "Arjun", "Harsh", "Ankit", "Vivek"
        };

        int[] rollNumbers = {
            101, 102, 103, 104, 105,
            106, 107, 108, 109, 110
        };

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Name: " + names[i] +
                                   ", Roll Number: " + rollNumbers[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
            System.out.println("Only 10 students are available.");
        }

        System.out.println("Program executed successfully.");
    }
} {
    
}
