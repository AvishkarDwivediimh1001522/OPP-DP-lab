public class peak_ele {

    // A function to find the peak element in an array
    public static int findPeak(int[] arr) {
        // Initialize the left and right pointers
        int left = 0;
        int right = arr.length - 1;

        // Loop until the left and right pointers meet
        while (left < right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // Check if the middle element is a peak
            if (arr[mid] >= arr[mid + 1] && arr[mid] >= arr[mid - 1]) {
                return arr[mid];
            }

            // If the middle element is smaller than its right neighbor,
            // then the peak element must be in the right half
            else if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            }

            // If the middle element is smaller than its left neighbor,
            // then the peak element must be in the left half
            else {
                right = mid - 1;
            }
        }

        // Return the left or right pointer as the peak element
        return arr[left];
    }

    // A main function to test the program
    public static void main(String[] args) {
        // Create an array of n elements
        int n = 10;
        int[] arr = new int[n];

        // Fill the array with random numbers
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        // Print the array
        System.out.print("The array is: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        // Find and print the peak element
        int peak = findPeak(arr);
        System.out.println("The peak element is: " + peak);
    }
}

