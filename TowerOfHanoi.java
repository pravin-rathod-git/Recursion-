/*Problem

You have:

3 rods

Source (A)

Auxiliary (B)

Destination (C)

N disks placed on the source rod in decreasing size.

Rules

Move only one disk at a time.

A bigger disk cannot be placed on a smaller disk.

Use the auxiliary rod to help move disks.

Goal: Move all disks from Source → Destination.

IBH Method (Induction – Base – Hypothesis)

Since you prefer the Hypothesis method, let's explain using IBH.

1️⃣ Base Case

If there is only 1 disk:

Move disk 1 from A → C

No recursion is needed.

2️⃣ Hypothesis

Assume that the function can correctly move n-1 disks from:

Source → Auxiliary

using the destination rod.

3️⃣ Induction

To move n disks from A → C:

Step 1
Move n-1 disks from A → B

Step 2
Move the largest disk (nth disk) from A → C

Step 3
Move n-1 disks from B → C

Recurrence Relation
T(n) = 2T(n-1) + 1

Time Complexity

O(2^n)

Minimum moves required

2^n - 1

Example

For 3 disks

2^3 - 1 = 7 moves */




public class TowerOfHanoi {

    static int count = 0;

    public static void solve(int n, char source, char helper, char destination) {

        // Base Case
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            count++;
            return;
        }

        // Step 1: Move n-1 disks from source to helper
        solve(n - 1, source, destination, helper);

        // Step 2: Move nth disk
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        count++;

        // Step 3: Move n-1 disks from helper to destination
        solve(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {

        int n = 3;

        solve(n, 'A', 'B', 'C');

        System.out.println("Total moves: " + count);
    }
}