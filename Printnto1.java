
// 🧩 Thinking Structure
// ✅ Base Condition:

// If n == 1, print 1 and return.

// ✅ Hypothesis:

// Assume that the function correctly prints numbers from n-1 to 1.

// ✅ Induction:

// If function prints n-1 to 1 correctly, then just print n before that.




public class Printnto1 {
    public static void Print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        Print(n-1);

    }

    public static void main(String[] args) {
        Print(7);
    }
}
