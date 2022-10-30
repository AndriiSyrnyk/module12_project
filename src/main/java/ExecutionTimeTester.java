import java.util.Timer;
import java.util.TimerTask;

public class ExecutionTimeTester {
    public static void main(String[] args) {
        Timer thread1 = new Timer();
        Timer thread2 = new Timer();

        thread1.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Пройшло 5 секунд. ");
            }
        }, 5000, 5000);

        MyTimer executionTime = new MyTimer(0);

        thread2.schedule(new TimerTask() {
            @Override
            public void run() {
                executionTime.addSeconds(1);
                System.out.println(executionTime.getStringFormattedTime());
            }
        }, 1000, 1000);
    }
}
