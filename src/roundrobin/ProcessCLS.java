package roundrobin;

public class ProcessCLS {

    private int processID;
    private static int cntID = 10;
    private long processDuration;
    private long processingTime;
    private String processName;


//    public ProcessCLS(String name) {
//        processName = name;
//        processID = cntID++;
//        this.processingTime = 0;
//        this.processDuration = 0;
//        System.out.println("Created process - duration not defined");
//    }
    public ProcessCLS(String name, long timeDuration) {
        processName = name;
        processID = cntID++;
        this.processingTime = 0;
        this.processDuration = timeDuration;
        System.out.println("Created process");
    }

    public void setProcessDuration(long timeDuration) {
        this.processDuration = timeDuration;
    }

    public String getProcessName() {
        return processName;
    }

    public int getProcessID() {
        return processID;
    }

    public boolean isFinished() {
        return processDuration == processingTime;
    }

    public boolean processingStep(long timeElapsed) {
        processingTime += timeElapsed;
        return processingTime < processDuration;
    }


    @Override
    public String toString() {
        return "{" +
                "duration=" + processDuration +
                ", time=" + processingTime +
                ", name='" + processName + '\'' +
                '}';
    }
}
