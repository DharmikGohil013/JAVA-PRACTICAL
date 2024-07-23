
import java.util.Scanner;

class complex{
    public float a1;
    public float b1;
    public complex(float a,float b)
    {
        this.a1=a;
        this.b1=b;
    }
    public float sum()
    {
        return a1+b1;
    }
    public float multi()
    {
        return a1*b1;
    }
    public float substa()
    {
        return a1-b1;
    }
    public float divi()
    {
        return a1/b1;
    }

}
class pra15{
    public static void main(String[] args) {
        System.out.println("\t\t\t::::::::: MAIN MANU :::::::::::");
        System.out.println("1.sum");
        System.out.println("2.multipl..");
        System.out.println("3.substraction");
        System.out.println("4.division");
        System.out.println("Enter option:- ");
        Scanner sc=new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println("Enter A = ");
        float a=sc.nextFloat();
        System.out.println("Enter B = ");
        float b=sc.nextFloat();
        complex obj11 = new complex(a,b);
        switch(option)
        {
            case 1:
            {
                
                System.out.println("Sum is: - "+obj11.sum());
                break;
            }
            case 2:
            {
                System.out.println("Mutli is: - "+obj11.multi());
                break;
            }
            case 3:
            {
                System.out.println("substraction is -"+obj11.substa());
                break;
            }
            case 4:
            {
                System.out.println("division is : - "+obj11.divi());
                break;
            }
            default:{
                System.out.println("Thank You:::");
                break;
            }
        }
    }
}