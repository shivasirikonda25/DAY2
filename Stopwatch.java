public class Stopwatch {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started...");
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        System.out.println("Stopwatch stopped...");
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}