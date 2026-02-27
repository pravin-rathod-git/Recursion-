// 🧩 Thinking Structure

// At each character → we have 2 choices:

// Include it

// Exclude it

// ✅ Base Condition:

// If input string becomes empty → print output.

// ✅ Hypothesis:

// Assume function prints all subsets for smaller string.

// ✅ Induction:

// For current character:

// Call once including it

// Call once excluding it

public class SubSetsOfString {

    public static void Subset(String input, String output) {

        // ✅ Base Condition
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        // ✅ Exclude current character
        Subset(input.substring(1), output);

        // ✅ Include current character
        Subset(input.substring(1), output + input.charAt(0));
    }

    public static void main(String[] args) {

        String input = "abc";
        String output = "";

        System.out.println("Subsets of string \"" + input + "\" are:");

        Subset(input, output);
    }
}
