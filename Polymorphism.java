class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: bow wow");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

//Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance

public class Polymorphism{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myPig = new Pig();

        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }
}