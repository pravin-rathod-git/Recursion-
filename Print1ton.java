// 🧩 Thinking Structure
// ✅ Base Condition:

// If n == 1, print 1 and return.

// ✅ Hypothesis:

// Assume that the function correctly prints numbers from 1 to n-1.

// ✅ Induction:

// If function prints 1 to n-1 correctly, then just print n after that.




public class Print1ton {
    public static void Print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        Print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Print(7);
    }
}
