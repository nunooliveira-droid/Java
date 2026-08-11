//The super keyword is used to refer to the parent class of a subclass

class Animals{
    String type = "Animal";
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
    Animals() {
        System.out.println("Animal is created");
    }
}

class Dogs extends Animals{
    String type = "Dog";
    public void printType() {
        System.out.println(super.type); // Access parent attribute
    }
    public void animalSound(){
        super.animalSound();
        System.out.println("The dog says: bow wow");
    }
    Dogs() {
        super(); // Call parent constructor
        System.out.println("Dog is created");
    }
}

public class SuperKeyword{
    public static void main(String[] args) {
        Dogs myDog = new Dogs();
        myDog.animalSound();
        myDog.printType();
    }
}

