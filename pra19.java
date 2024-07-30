
    public class pra19
    {
        public static void main(String[] args) 
        {
            rectegal obj2 = new rectegal();
            circle obj3 = new circle();
            square obj4 = new square();
            obj2.shape1();
            obj2.rectegal1();
            obj3.shape1();
            obj3.circle1();
            obj4.rectegal1();
            obj4.square1();
        }
    }
    class shape
    {
    public void shape1()
    {
        System.out.print("this is shape");
    } 
    }
    class rectegal extends  shape
    {
        public void rectegal1()
    {
        System.out.print("this is rectegal");
    }
    }
    class circle extends  shape
    {
        public void circle1()
        {
        System.out.print("this is circle ");
        }
    }
    class square extends rectegal
    {
        public void square1()
    {
        System.out.print("rectegal is a square");
    }
    }