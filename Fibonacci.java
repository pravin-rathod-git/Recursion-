public class Fibonacci {

    public static int FindFibonacci(int n) {

        // ✅ Base Condition
        if (n == 0) return 0;
        if (n == 1) return 1;

        // ✅ Hypothesis + Induction
        return FindFibonacci(n - 1) + FindFibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 6;

        int result = FindFibonacci(n);

        System.out.println("Fibonacci of " + n + " is: " + result);
    }
}
