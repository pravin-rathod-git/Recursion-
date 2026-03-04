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