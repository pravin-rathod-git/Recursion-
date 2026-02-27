// 🧩 Thinking Structure
// ✅ Base Condition:

// If array size is 1 → return true.

// ✅ Hypothesis:

// Assume array from index 1 onward is sorted.

// ✅ Induction:

// Check if arr[0] <= arr[1] AND remaining array is sorted.


public class ArraySorted {
    public static boolean isSorted(int arr[],int n){
        if(n==1) return true;

        if(arr[n-1]<arr[n-2]) return false;

        return isSorted(arr, n-1);
    }

    public static void main(String[] args){
        int[] arr={10,20,22,30,40,60,80,155,600,750};
        int n=arr.length;
        System.out.println(isSorted(arr, n));
    }
}
