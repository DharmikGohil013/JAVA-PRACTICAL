public class lamda {
    public static void main(String[] args) {
        MAth additilon = (a,b)->a+b;
        MAth multi = (a,b)->a*b;
        System.out.println("addintion " +additilon.opration(10,50));
        System.out.println("multi " + multi.opration(100,200));
    }
}
@FunctionalInterface
interface MAth{
    int opration (int a,int b);
}
