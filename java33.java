import java.util.Random;

class EvenThread implements Runnable {
    private int num;

    public EvenThread(int num) {
        this.num = num;
    }

    public void run() {
        if (num % 2 == 0) {
            System.out.println("Square of " + num + " is: " + (num * num));
        }
    }
}

class OddThread implements Runnable {
    private int num;

    public OddThread(int num) {
        this.num = num;
    }

    public void run() {
        if (num % 2 != 0) {
            System.out.println("Cube of " + num + " is: " + (num * num * num));
        }
    }
}

public class java33 {
    public static void main(String[] args) {
        Random rand = new Random();

        Runnable r1 = new EvenThread(rand.nextInt());
        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2 = new OddThread(rand.nextInt());
        Thread t2 = new Thread(r2);
        t2.start();

        Runnable r3 = new EvenThread(rand.nextInt());
        Thread t3 = new Thread(r3);
        t3.start();
    }
}