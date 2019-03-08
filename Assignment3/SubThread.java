package Assignment3;

public class SubThread extends Thread {
    public void run() {

        for (int i = 1; i < 50; i++) {
            try {
                System.out.println(""+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
