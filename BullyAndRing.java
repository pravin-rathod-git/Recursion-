import java.util.*;

class RingAlgorithm {
    private List<Integer> processes;
    private Map<Integer, Boolean> active;
    private int leader;

    public RingAlgorithm(List<Integer> processes) {
        this.processes = processes;
        this.active = new HashMap<>();
        for (int p : processes) {
            active.put(p, true);
        }
    }

    public void crashProcess(int pid) {
        active.put(pid, false);
        System.out.println("Process " + pid + " crashed.");
    }

    public void startElection(int initiator) {
        System.out.println("\nProcess " + initiator + " starts election");

        int n = processes.size();
        int index = processes.indexOf(initiator);
        List<Integer> electionList = new ArrayList<>();

        int i = index;

        do {
            int current = processes.get(i);
            if (active.get(current)) {
                electionList.add(current);
                System.out.println("Process " + current + " passes message");
            }
            i = (i + 1) % n;
        } while (processes.get(i) != initiator);

        leader = Collections.max(electionList);
        System.out.println("Process " + leader + " becomes LEADER");
    }

    public void showLeader() {
        System.out.println("\nCurrent Leader: " + leader);
    }

    public static void main(String[] args) {
        List<Integer> processes = Arrays.asList(1, 2, 3, 4, 5);
        RingAlgorithm ring = new RingAlgorithm(processes);

        ring.crashProcess(5); // leader crashes
        ring.startElection(2);
        ring.showLeader();
    }
}