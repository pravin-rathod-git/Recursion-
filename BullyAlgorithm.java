import java.util.Scanner;

public class BullyAlgorithm {

    static boolean processes[];
    static int n;
    static int coordinator;

    // Election Function
    static void election(int processId) {

        coordinator = processId;

        for (int i = processId + 1; i <= n; i++) {

            if (processes[i]) {
                System.out.println("Process " + processId +
                        " sends ELECTION message to Process " + i);

                election(i); // higher process starts election
                return;
            }
        }

        // If no higher process exists
        System.out.println("Process " + processId + " becomes the new COORDINATOR");
        coordinator = processId;
    }

    // Crash a process
    static void crashProcess(int id) {
        processes[id] = false;
        System.out.println("Process " + id + " has crashed.");
    }

    // Recover a process
    static void recoverProcess(int id) {

        processes[id] = true;
        System.out.println("Process " + id + " has recovered.");

        // If recovered process has higher ID than coordinator
        if (id > coordinator) {
            System.out.println("Recovered process " + id + " starts election.");
            election(id);
        } else {
            System.out.println("Current coordinator remains Process " + coordinator);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        n = sc.nextInt();

        processes = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            processes[i] = true;
        }

        coordinator = n; // highest ID initially
        System.out.println("Initial Coordinator is Process " + coordinator);

        System.out.print("Enter process to crash: ");
        int crash = sc.nextInt();

        crashProcess(crash);

        System.out.print("Enter process that detects failure: ");
        int detect = sc.nextInt();

        election(detect);

        System.out.println("Coordinator after election: Process " + coordinator);

        System.out.print("Enter process to recover: ");
        int recover = sc.nextInt();

        recoverProcess(recover);

        System.out.println("Final Coordinator is Process " + coordinator);

        sc.close();
    }
}