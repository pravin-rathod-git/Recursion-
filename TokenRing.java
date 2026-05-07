import java.util.Scanner;

public class TokenRing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int token = 0; // initially token with process 0

        System.out.println("Initial token holder: Process " + token);

        while (true) {

            System.out.print("\nEnter process requesting critical section (-1 to stop): ");
            int request = sc.nextInt();

            if (request == -1)
                break;

            System.out.println("\nPassing the token...");

            while (token != request) {
                System.out.println("Token passed from Process " + token +
                        " to Process " + ((token + 1) % n));
                token = (token + 1) % n;
            }

            System.out.println("\nProcess " + request +
                    " has received the TOKEN and entered the CRITICAL SECTION");

            System.out.println("Process " + request + " exits the CRITICAL SECTION");

            token = (token + 1) % n;

            System.out.println("Token passed to Process " + token);
        }

        sc.close();
    }
}