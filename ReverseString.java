// 🧩 Thinking Structure
// ✅ Base Condition:

// If string length ≤ 1 → return string.

// ✅ Hypothesis:

// Assume recursive call correctly reverses substring from index 1 onward.

// ✅ Induction:

// Attach first character at the end.



public class ReverseString {
    public static String Reverse(String s){
        if(s.length()<=1){
            return s;
        }

        return Reverse(s.substring(1))+s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(Reverse("Madam"));
    }
}
