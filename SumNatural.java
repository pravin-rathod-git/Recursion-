public class SumNatural {

    public static int Sum(int n){
        
        // Base Condition:
        // If n = 1, sum of first natural number is 1
        if(n == 1) return 1;

        // Induction Hypothesis:
        // Assume Sum(n - 1) correctly returns the sum of first (n - 1) natural numbers
        
        // Inductive Step:
        // Then Sum(n) = n + Sum(n - 1)
        // Which means we add nth number to the sum of first (n - 1) numbers
        return n + Sum(n - 1);
    }

    public static void main(String[] args){
        System.out.println(Sum(10));  // Output: 55
    }
}