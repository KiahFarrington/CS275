// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.Math;
import java.util.Scanner;

class Kiah_Farrington_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input size of the Array
        System.out.print("Enter an integer n for size of matrix: ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        
        // taking in the values for array
        System.out.println("Now enter each element, seperating each value with spaces: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        // performing operations and printing the result
        int result = diagonalDifference(arr);
        System.out.println("The absolute difference between the sums of the matrix's diagonals is: " + result);
        in.close();
        
    }
    
    public static int diagonalDifference(int [][] arr){

        int n = arr.length;  //assuming rows and columns are the same
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        
        for(int i = 0; i < n; ++i) // finds both primary and secondary sum
        {
            primaryDiagonal += arr[i][i];
            secondaryDiagonal += arr[i][n-(i + 1)];
        }
        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }
}