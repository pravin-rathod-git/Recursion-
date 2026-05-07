import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    // Function to generate all balanced parentheses
    public static List<String> generateParenthesis(int n) {

        // List to store final valid combinations
        List<String> result = new ArrayList<>();

        // Start recursion
        // current = current generated string
        // open = count of opening brackets used
        // close = count of closing brackets used
        backtrack(result, "", 0, 0, n);

        return result;
    }

    // Recursive backtracking function
    private static void backtrack(List<String> result,
            String current,
            int open,
            int close,
            int n) {

        /*
         * Base Case:
         * If length becomes 2*n,
         * it means we used all brackets
         * and formed one valid combination
         */
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        /*
         * Condition 1:
         * We can add '(' only if
         * number of opening brackets used is less than n
         */
        if (open < n) {

            // Add '(' and move recursively
            backtrack(result,
                    current + "(",
                    open + 1,
                    close,
                    n);
        }

        /*
         * Condition 2:
         * We can add ')' only when
         * closing brackets are less than opening brackets
         * 
         * This ensures the parentheses remain balanced
         */
        if (close < open) {

            // Add ')' and move recursively
            backtrack(result,
                    current + ")",
                    open,
                    close + 1,
                    n);
        }
    }

    public static void main(String[] args) {

        // Number of pairs of parentheses
        int n = 3;

        // Generate all combinations
        List<String> ans = generateParenthesis(n);

        // Print all valid parentheses
        for (String s : ans) {
            System.out.println(s);
        }
    }
}