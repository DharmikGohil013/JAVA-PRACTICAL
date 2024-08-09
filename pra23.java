public class pra23
 {
    public static void main(String[] args) {
        try
        {
            
            int result = divide(10, 1);
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Program continues...");
    }
    public static int divide(int numerator, int denominator) 
    {
        return numerator / denominator;
    }
}
