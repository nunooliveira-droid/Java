//For attributes, methods and constructors the modifier public the code is accessible for all classes
//For attributes, methods and constructors the modifier private the code is only accessible within the declared class

class Person{
        public String name = "Jonh"; // Public - accessible everywhere
        private int age = 20; // Private - only accessible inside this class
}

public class Modifiers{
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);   // Works fine
        //System.out.println(p.age);    // Error: age has private access in Person
    }
}