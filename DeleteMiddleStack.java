import java.util.ArrayList;
import java.util.List;

public class DeleteMiddleStack {

    public static void deleteMiddle(List<Integer> stack, int size) {

        int middle = size / 2;  // zero-based index

        solve(stack, middle);
    }

    private static void solve(List<Integer> stack, int k) {

        // ✅ Base condition: when middle element reached
        if (k == 0) {
            stack.remove(stack.size() - 1);
            return;
        }

        // Remove top element
        int top = stack.remove(stack.size() - 1);

        // Recursive call
        solve(stack, k - 1);

        // Push element back (except middle)
        stack.add(top);
    }

    public static void main(String[] args) {

        List<Integer> stack = new ArrayList<>();

        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        System.out.println("Original Stack: " + stack);

        deleteMiddle(stack, stack.size());

        System.out.println("After Deleting Middle: " + stack);
    }
}