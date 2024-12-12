class main{
    public static void main(String[] args) {
        Animal  mydog = new dog();
        Animal  mycat = new cat();
        mydog.eat();
        mydog.sound();
        mycat.eat();
        mycat.sound();
    }
}
abstract class Animal {
    abstract void sound();

    // Regular method
    void eat() {
        System.out.println("This animal eats food.");
    }

}
/**
 * Main
 */
class dog extends Animal{

void sound()
{
    System.out.println("boww");
}
    
}
class cat extends Animal{

    void sound()
    {
        System.out.println("miyaw");
    }
        
    }