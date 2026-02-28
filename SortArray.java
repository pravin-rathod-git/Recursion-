// We solve sorting in 2 steps:

// Step 1:

// Remove the last element and recursively sort the remaining array.

// Step 2:

// Insert the removed element at its correct position.

// 🧩 Hypothesis Method
// ✅ Base Condition

// If array size = 1 → already sorted.

// ✅ Hypothesis

// Assume first n-1 elements are sorted.

// ✅ Induction

// Insert the nth element in correct position.




public class SortArray {

    public static void Sort(int arr[], int n) {

        // ✅ Base condition
        if (n == 1) {
            return;
        }

        int last = arr[n - 1];

        // Recursively sort first n-1 elements
        Sort(arr, n - 1);

        // Insert last element correctly
        insert(arr, n - 1, last);
    }

    public static void insert(int[] arr, int n, int value) {

        // If empty OR correct position found
        if (n == 0 || arr[n - 1] <= value) {
            arr[n] = value;
            return;
        }

        int temp = arr[n - 1];

        // Shift and insert recursively
        insert(arr, n - 1, value);

        arr[n] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 500, 40, 60, 70, 20};

        Sort(arr, arr.length);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}