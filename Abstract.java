// Abstract class
abstract class Cars{
    //Abstract method (does not have a body)
    public abstract void carSound(); 
    // Regular method
    public void sleep(){
        System.out.println("Zzz");
    }
}

class Volvo extends Cars{
    public void carSound(){
        // The body of CarSound() is provided here
        System.out.println("Vruuuum!");
    }
}

public class Abstract{
    public static void main(String[] args) {
        Volvo myVolvo = new Volvo();
        myVolvo.carSound();
        myVolvo.sleep();
    }
}