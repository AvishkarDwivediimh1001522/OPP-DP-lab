import java.util.*;
// A class to demonstrate insertion and deletion in an array
public class insertion_simple_arr {

    // A method to insert an element at a given index
    public static void insert(int[] arr, int index, int element) {
        // Check if the index is valid
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index");
            return;
        }
        // Create a new array with one extra space
        int[] newArr = new int[arr.length + 1];
        // Copy the elements before the index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        // Insert the element at the index
        newArr[index] = element;
        // Copy the elements after the index
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        // Print the new array
        System.out.println("Array after insertion:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // A method to delete an element at a given index
    public static void delete(int[] arr, int index) {
        // Check if the index is valid
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return;
        }
        // Create a new array with one less space
        int[] newArr = new int[arr.length - 1];
        // Copy the elements before the index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        // Copy the elements after the index
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        // Print the new array
        System.out.println("Array after deletion:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // A main method to test the methods
    public static void main(String[] args) {
        // Create an array
        int[] arr = {10, 20, 30, 40, 50};
        // Print the original array
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Insert an element at index 2
        insert(arr, 4, 25);
        // Delete an element at index 3
        delete(arr, 2);
    }
}

