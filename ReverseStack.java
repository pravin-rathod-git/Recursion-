// 🔹 FUNCTION: Reverse(st)
// 🧩 Hypothesis Method
// ✅ Base Condition

// If stack size = 1 → already reversed.

// ✅ Hypothesis

// Assume stack of size n-1 is correctly reversed by recursion.

// ✅ Induction

// Remove the top element.

// Recursively reverse remaining stack (size n-1).

// Insert removed element at bottom.

// Thus stack of size n becomes reversed.

// 🔹 FUNCTION: insert(st, top)
// 🧩 Hypothesis Method
// ✅ Base Condition

// If stack is empty → insert element.

// ✅ Hypothesis

// Assume element is correctly inserted at bottom of stack of size n-1.

// ✅ Induction

// Remove top element.

// Recursively insert element in smaller stack.

// Push removed element back.

// Thus element gets inserted at bottom.


import java.util.ArrayList;
import java.util.List;

public class ReverseStack {

    // Function to reverse the stack
    public static void reverse(List<Integer> st) {
        if (st.size() <= 1) {   // Base condition (handles empty also)
            return;
        }

        int top = st.remove(st.size() - 1); // Remove top
        reverse(st);                        // Reverse remaining stack
        insert(st, top);                    // Insert at bottom
    }

    // Function to insert element at bottom
    public static void insert(List<Integer> st, int top) {
        if (st.size() == 0) {  // Base condition
            st.add(top);
            return;
        }

        int value = st.remove(st.size() - 1);
        insert(st, top);
        st.add(value);
    }

    // Main method
    public static void main(String[] args) {

        List<Integer> stack = new ArrayList<>();

        // Pushing elements (like stack)
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);

        System.out.println("Original Stack: " + stack);

        reverse(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}