import java.util.Scanner;
import java.util.Random;//random is used to get random output from the computer

public class even_odd_arr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        // Declare and initialize the original array
        int[] original = new int[n];

        // Fill the original array with random integers
        for (int i = 0; i < n; i++) {
            original[i] = rand.nextInt(100);
        }

        // Display the original array
        System.out.println("The original array is: ");
        printArray(original);

        // Count the number of even and odd elements in the original array
        int evenCount = 0;
        int oddCount = 0;
        for (int num : original) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Declare and initialize the even and odd arrays
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        // Separate the even and odd elements from the original array
        int evenIndex = 0;
        int oddIndex = 0;
        for (int num : original) {
            if (num % 2 == 0) {
                even[evenIndex] = num;
                evenIndex++;
            } else {
                odd[oddIndex] = num;
                oddIndex++;
            }
        }

        // Display the even and odd arrays
        System.out.println("The even array is: ");
        printArray(even);
        System.out.println("The odd array is: ");
        printArray(odd);

        // Close the scanner
        scan.close();
    }

    // A helper method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

