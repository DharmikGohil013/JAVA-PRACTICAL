class pra16
{
    public static void main(String[] args) {
        System.out.println(":::::::::::::::::  Syntex of inheritance :::::::::");
        child obj111 = new child ();
        obj111.perant();
        obj111.child();
    }
}
class perant
{
    public void  perant() 
    {
        System.out.println("this is perent class:");
    }
    
}
class child extends perant
{
    public void child()
    {
        System.out.println("this is child class:");
    }
}