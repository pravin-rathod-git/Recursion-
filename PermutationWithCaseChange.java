/*

🔷 Problem Statement

Given a string, generate all permutations by changing each character’s case (lower/upper).

✅ Example

Input: "ab"
Output:

ab
aB
Ab
AB
🧠 IBH Method (Very Important for Interviews)
🔹 1. Base Case (B)

If input becomes empty → print the output.

🔹 2. Hypothesis (H)

Assume that for a smaller string (like "b"), the function correctly generates:

b
B
🔹 3. Induction (I)

For each character, we have 2 choices:

Convert to lowercase
Convert to uppercase

👉 Then recursively solve for the remaining string.

🌳 Recursive Tree (for "ab")
Start: "" | ab

                    ""
                 /        \
               a            A
            /    \       /      \
          ab     aB     Ab       AB
⚙️ Step-by-Step Flow
Take first character 'a'
Two choices:
'a'
'A'
Repeat same for 'b'

*/

public class PermutationWithCaseChange {

    public static void solve(String input, String output) {
        // Base case
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        char ch = input.charAt(0);
        String remaining = input.substring(1);

        // Choice 1: lowercase
        solve(remaining, output + Character.toLowerCase(ch));

        // Choice 2: uppercase
        solve(remaining, output + Character.toUpperCase(ch));
    }

    public static void main(String[] args) {
        String input = "ab";
        solve(input, "");
    }
}
