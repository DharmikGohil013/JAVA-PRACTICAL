package multirading;

public class multi {
    public static void main(String[] args) {
        mytrad t = new mytrad();
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("main thread");
        }
    }
}
class mytrad extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("user thread");
        }
    }
}