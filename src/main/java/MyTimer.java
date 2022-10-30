public class MyTimer {
    long timeInSeconds;
    public MyTimer(long timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public void addSeconds(long seconds) {
        timeInSeconds += seconds;
    }

    public String getStringFormattedTime() {
        return secondsToStringFormattedTime(timeInSeconds);
    }

    private String secondsToStringFormattedTime(long timeInSeconds) {
        long hours = timeInSeconds / 3600;
        long minutes = (timeInSeconds % 3600) / 60;
        long seconds = timeInSeconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
