import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A[][] = new int[3][3];
        int B[][] = new int[3][2];
        int C[][] = new int[3][2];

        System.out.println("Enter elements of Matrix A (3x3):");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                A[i][j]=sc.nextInt();