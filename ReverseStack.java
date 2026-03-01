


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