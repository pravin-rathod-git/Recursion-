import java.util.ArrayList;
import java.util.List;

public class SortStack {

    public static void sort(List<Integer> st) {

        // ✅ Base condition
        if (st.size() <= 1) {
            return;
        }

        // Remove top element
        int top = st.remove(st.size() - 1);

        // Recursively sort remaining stack
        sort(st);

        // Insert element at correct position
        insert(st, top);
    }

    public static void insert(List<Integer> st, int value) {

        // If stack empty OR correct position found
        if (st.size() == 0 || st.get(st.size() - 1) <= value) {
            st.add(value);
            return;
        }

        // Remove top element
        int top = st.remove(st.size() - 1);

        // Recursive insert
        insert(st, value);

        // Push back removed element
        st.add(top);
    }

    public static void main(String[] args) {

        List<Integer> stack = new ArrayList<>();

        stack.add(3);
        stack.add(1);
        stack.add(4);
        stack.add(2);

        sort(stack);

        System.out.println("Sorted Stack:");
        System.out.println(stack);
    }
}