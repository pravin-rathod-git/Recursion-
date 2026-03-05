/*
Idea of the Problem

For every character in the string we have two choices:

Include the character in the subset

Exclude the character

So the recursion tree splits into two branches for each character.

For a string of length n, total subsets = 2ⁿ.

Example for "ab":

        ""
       /  \
     ""    "a"
    /  \   /  \
  ""  "b" "a" "ab"

Output:

""
"b"
"a"
"ab"










IBH (Hypothesis Method) Explanation
1️⃣ Hypothesis

Assume the function

printSubsets(input, output)

correctly prints all subsets of the remaining string input and stores the selected characters in output.

2️⃣ Induction (Work we do)

Take the first character of the string.

Two recursive choices:

Case 1: Exclude the character
printSubsets(input.substring(1), output)
Case 2: Include the character
printSubsets(input.substring(1), output + input.charAt(0))

So the recursion explores all possibilities.

3️⃣ Base Case

When:

input.length() == 0

No characters remain.

So we print the subset stored in output. */


public class PrintSubsets {

    public static void printSubsets(String input, String output) {

        // Base Case
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        // Choice 1: Exclude the first character
        printSubsets(input.substring(1), output);

        // Choice 2: Include the first character
        printSubsets(input.substring(1), output + input.charAt(0));
    }

    public static void main(String[] args) {

        String input = "abc";
        String output = "";

        printSubsets(input, output);
    }
}