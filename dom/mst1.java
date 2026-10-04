public class mst1 {
    public static void main(String[] args) {

        String[] names = {
            "Aditya", "Aman", "Rahul", "Rohit", "Karan",
            "Arjun", "Vikas", "Ankit", "Nikhil", "Sahil"
        };

        int[] rollNumbers = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(
                    "Name: " + names[i] +
                    ", Roll Number: " + rollNumbers[i]
                );
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception!");
        }
    }
}
