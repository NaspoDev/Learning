public class Main {
    public static void main(String[] args) {

        // Multithreading: Run multiple things at the same time.
        // Take advantage of multiple threads on CPUs.

        // Notes:
        // - Even if one thread crashes, it won't affect the others.

        MultiThreadThing myThing = new MultiThreadThing("My thread 1");
        MultiThreadThing myThing2 = new MultiThreadThing("My thread 2");

        // Call the start method to start the thread.
        myThing.start();
        System.out.println(myThing.isAlive()); // returns true if thread is alive, false if dead.

        // You can also use a for loop
        // Ex. Running 3 threads.
        System.out.println("Onto running the 3 threads from the for loop!");
        for (int i = 0; i < 3; i++) {
            MultiThreadThing myOperation = new MultiThreadThing("My thread from loop " + i);
            myOperation.start();
        }

        myThing2.start();
        // use the join() method to to wait for a thread to complete its execution before continuing with the current thread.
        try {
            myThing2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // if join() wasnt here, this would print as soon as the main thread finished calling all of our other threads.
        System.out.println("Main thread is done.");
    }
}