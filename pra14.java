
import java.util.Scanner;

class Pra14{
    public static void main(String[] args) {
        System.err.println("Enter Length Of Rectengal : - ");
        Scanner sc=new Scanner(System.in);
        float length=sc.nextFloat();
        System.out.println("Enter Breadth of Rectengal : - ");
        float breadth=sc.nextFloat();
        aera obj1 = new aera(length,breadth);
        float Ae;
        Ae=obj1.aera1();
        System.out.println("Rectengle Aera : - "+Ae);
    }
}
class aera{
    public float  l1;
    public float b1;
    public aera(float length,float breadth)
    {
        this.l1=length;
        this.b1=breadth;
    }
    public float aera1()
    {
        return l1*b1;
    }
    
}