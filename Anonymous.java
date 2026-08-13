//An anonymous class is a class without a name. It is created and used at the same time.

class Animal{
    public void makeSound() {
    System.out.println("Animal sound");
  }
}

// Interface
interface Greeting {
  void sayHello();
}


public class Anonymous{
    public static void main(String[] agrs){
      Animal myAnimal = new Animal(){
        public void makeSound(){
          System.out.println("Woof woof");
        }
      }; // semicolon is required to end the line of code that creates the object

      Greeting greet = new Greeting() {
        public void sayHello(){
          System.out.println("Hello, World!");
        }
      };

      myAnimal.makeSound();
      greet.sayHello();
    }
}