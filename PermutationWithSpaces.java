/*
🔷 Problem Statement

Given a string (e.g., "ABC"), generate all permutations by inserting spaces between characters.

✅ Example

Input: "ABC"
Output:

A B C
A BC
AB C
ABC
🧠 IBH Method Explanation
🔹 1. Base Case (B)

If the input string becomes empty, print the output.

👉 Meaning:
When no characters are left to process → we have formed one valid permutation.

🔹 2. Hypothesis (H)

Assume that for a smaller input (say "BC"), the function correctly generates all permutations with spaces.

🔹 3. Induction (I)

Now take one character at a time and make two choices:

Add character with space
Add character without space

👉 This branching creates all possibilities.

🌳 Recursive Tree (for "ABC")
Start: A | BC

                    A
                 /      \
            A_ B         AB
           /    \       /    \
      A_ B_ C  A_ BC  AB_ C   ABC

👉 Replace _ with space:

Level 0:        "A"
Level 1:     "A B"      "AB"
Level 2:  "A B C"  "A BC"  "AB C"  "ABC"
⚙️ Step-by-Step Flow
Fix first character "A" (always included)
For remaining "BC":
Add " B" or "B"
Repeat for "C"

*/


public class PermutationWithSpaces {

    public static void solve(String input, String output) {
        // Base Condition
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        // Take first character
        char ch = input.charAt(0);

        // Remaining input
        String remaining = input.substring(1);

        // Choice 1: Add space + character
        solve(remaining, output + " " + ch);

        // Choice 2: Add character without space
        solve(remaining, output + ch);
    }

    public static void main(String[] args) {
        String input = "ABC";

        // First character fixed
        String output = "" + input.charAt(0);

        // Call recursion for remaining string
        solve(input.substring(1), output);
    }
}
