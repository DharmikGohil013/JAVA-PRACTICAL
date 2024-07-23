
import java.util.Scanner;

class Pra14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee DAY: ");
        int day = sc.nextInt();
        System.out.print("Enter Employee Month: ");
        int month = sc.nextInt();
        System.out.print("Enter Employee Year: ");
        int year = sc.nextInt();
        Date emp = new Date(day,month,year);
    }
}
class Date
{
    private int day;
    private int month;
    private int year;
    public Date(int day,int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    void setday(int day)
    {
        this.day = day;
    }
}