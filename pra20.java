public class pra20
{
    public static void main(String[] args) 
    {
        System.out.println("pra20");
        undergraguat obj1 = new  undergraguat();
        postgraguant obj2 = new postgraguant();
        obj1.degree();
        obj1.undergraguat();
        obj2.degree();
        obj2.postgraguant();
}
 class degree
{
    public void degree()
    {
        System.err.println("I got a degree");
    }
}
 class undergraguat extends  degree
{
    public  void undergraguat()
    {
        System.out.println("I am an Undergraduate");
    }
}
  class postgraguant extends degree
{
    public void postgraguant()
    {
        System.out.println("I am an postgraduate");
    }
}