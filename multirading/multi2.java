package multirading;

public class multi2 {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.run();
    }
}
class Mythread extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("call No = "+i);
        }
    }
}