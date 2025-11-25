package threads;

public class ReminderThread extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            try {
                System.out.println("Sending reminders...");
                Thread.sleep(2000);
                System.out.println("Reminder sent successfully!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
