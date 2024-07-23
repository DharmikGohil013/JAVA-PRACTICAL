import java.util.Scanner;
class Pra13
 {
    public static void main(String[] args)
     {
        System.out.println("23DI013 :- DHARMIK GOHIL \n\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee First Name: ");
        String Fname = sc.nextLine();
        System.out.print("Enter Employee Last Name: ");
        String Lname = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        Double Esalary = sc.nextDouble();
        sc.nextLine();
        Employee emp1 = new Employee(Fname, Lname, Esalary);
        emp1.getName();
        emp1.getLname();
        System.out.println("Employee Salary: "+emp1.getSalary());
        double rais,x=emp1.getSalary();
        rais = x + (x*0.1);
        System.out.println("Employee Rais Salary: "+rais);
    }
}
class Employee 
{
    private String Fname;
    private String Lname;
    private Double Esalary;
    public Employee(String Fname, String Lname, Double Esalary)
    {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Esalary = Esalary;
    }
    void setName(String Fname)
    {
        this.Fname = Fname;
    }
    void setLname(String Lname) 
    {
        this.Lname = Lname;
    }
    void setSalary(Double Esalary) 
    {
        this.Esalary = Esalary;
    }
    String getName() 
    {
        return Fname;
    }
    String getLname() 
    {
        return Lname;
    }
    Double getSalary() 
    {
        return Esalary;
    }

    void displayEmployeeDetails() 
    {
        System.out.println("Employee First Name: " + getName());
        System.out.println("Employee Last Name: " + getLname());
        System.out.println("Employee Salary: " + getSalary());
        
    }
}
