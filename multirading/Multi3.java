package multirading;

public class Multi3 {
    public static void main(String[] args) 
    {
        int n=10;
        for(int i=0;i<n;i++)
        {
            MultithreadingDemo  t = new MultithreadingDemo();
            t.start();
        }
    }
}
class MultithreadingDemo extends Thread
{
    public void run()
    {
        try {
            // Displaying the thread that is running
            Thread.sleep(1000);
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            
            System.out.println("Exception is caught");
        }
    }
}
