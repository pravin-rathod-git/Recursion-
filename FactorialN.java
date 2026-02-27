// 🧩 Thinking Structure
// ✅ Base Condition:

// If n == 0 → return 1.

// ✅ Hypothesis:

// Assume fact(n-1) correctly returns factorial of n-1.

// ✅ Induction:

// Then factorial of n = n × fact(n-1).

public class FactorialN {

    // Recursive method to calculate factorial
    public static int Factorial(int n){
        if(n == 0) return 1;   // Base case
        return n * Factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args){
        System.out.println(Factorial(5));  // Output: 120
    }
}