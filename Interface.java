//An interface is a completely "abstract class" that is used to group related methods with empty bodies

interface Animal{
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

class Sheep implements Animal{
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The sheep says: mee mee");
    }

    public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

//Interfaces can "inheritance" from a superclass to a subclass 
class DemoClass implements FirstInterface, SecondInterface{
    public void myMethod(){
        System.out.println("Some text..");
    }
    public void myOtherMethod(){
        System.out.println("Some other text...");
    }
}

public class Interface{
    public static void main(String[] args) {
        Sheep mySheep = new Sheep();
        DemoClass myDemo = new DemoClass();

        mySheep.animalSound();
        mySheep.sleep();
        myDemo.myMethod();
        myDemo.myOtherMethod();
    }
}