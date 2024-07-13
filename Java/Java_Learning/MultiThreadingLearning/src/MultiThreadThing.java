// Some class that will be run in a separate thread.
// Hence, it extends Thread.
public class MultiThreadThing extends Thread {

    private String text;
    public MultiThreadThing(String text) {
        this.text = text;
    }

    // run method inherited from Thread. Called automatically upon thread start.
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from " + text);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
