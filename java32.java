public class java32 extends Thread {
    private int start, end, total;
    private static int N;

    public java32(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            total += i;
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SumThread <N> <number_of_threads>");
            return;
        }

        N = Integer.parseInt(args[0]);
        int numThreads = Integer.parseInt(args[1]);

        java32[] threads = new java32[numThreads];
        int range = N / numThreads;

        int start = 1;
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new java32(start, start + range - 1);
            threads[i].start();
            start += range;
        }

        int finalTotal = 0;
        for (java32 thread : threads) {
            try {
                thread.join();
                finalTotal += thread.total;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of numbers from 1 to " + N + " is: " + finalTotal);
    }
}