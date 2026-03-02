/*1️⃣ Base Condition

If n == 1 and k == 1

Row 1: 0

So return 0.

2️⃣ Hypothesis

Assume:

kthGrammar(n-1, k) works correctly

Meaning:
It correctly gives k-th symbol of previous row.

3️⃣ Induction Step (Main Logic)

Row n length = 2^(n-1)

Middle index = 2^(n-1) / 2 = 2^(n-2)

Now:

✅ Case 1: k is in First Half

If:

k <= 2^(n-2)

Then:

Answer = kthGrammar(n-1, k)

Because first half is same as previous row.

✅ Case 2: k is in Second Half

If:

k > 2^(n-2)

Then:

Answer = complement of kthGrammar(n-1, k - 2^(n-2))

Because second half is complement of previous row.

Complement Rule:

0 → 1
1 → 0 */


public class findKthSymbolGrammar {

    public static int kthGrammar(int n, int k) {
        // Base Condition
        if (n == 1 && k == 1) {
            return 0;
        }

        int length = (int) Math.pow(2, n - 1);
        int mid = length / 2;

        // If k is in first half
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        } 
        // If k is in second half
        else {
            return 1 - kthGrammar(n - 1, k - mid);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 5;

        int result = kthGrammar(n, k);
        System.out.println("Kth Symbol: " + result);
    }
}