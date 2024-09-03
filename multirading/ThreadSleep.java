package multirading;
public class ThreadSleep {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread.sleep(11000);

        System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));
    }
}