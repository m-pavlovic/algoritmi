package roundrobin;

import cll.CLL;

public class TestCPURR {

    private static CLL<ProcessCLS> readyQueue = new CLL<>();

    public static void main(String[] args) {
        readyQueue = new CLL<>();
        ProcessCLS p1 = new ProcessCLS("P1", 1000);
        ProcessCLS p2 = new ProcessCLS("P2", 2000);
        ProcessCLS p3 = new ProcessCLS("P3", 3000);
        readyQueue.addFirst(p1);
        readyQueue.addFirst(p2);
        readyQueue.addLast(p3);
        System.out.println(readyQueue);
        simRoundRobin(10, readyQueue, 500);
    }

    /**
     * Metoda za simulaciju RR algoritma
     **/
    private static void simRoundRobin(int cycles, CLL<ProcessCLS> processes, long alocatedTime){

        if(processes.isEmpty()){
            System.out.println("CPU is idle - nothing to process!");
        } else {
            System.out.println("Number of processes to simulate: " + processes.size());
            System.out.println("Simulating Round Robin with " + cycles + " cycles and " + alocatedTime + " time for process");
            System.out.println("----------------------------------------------------------------------------------------------------");
           for (int k = 0; k < cycles; k++) {
               if (processes.isEmpty()) {
                   System.out.println("CPU finished all processes - out from looping!");
                   break;
               } else {
                   ProcessCLS actual = processes.getFirst();
                   System.out.println("CPU fetched: " + actual);
                   if (actual.processingStep(alocatedTime)) {
                       processes.rotate();
                   } else {
                       processes.removeFirst();
                       System.out.println("Removed process: " + actual);
                   }
               }
           }
        }
        System.out.println("Processes left: " + processes.size());
        System.out.println(processes);
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
