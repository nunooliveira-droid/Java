//abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass

    //abstract class
    abstract class Main{
        public String fname = "Jonh";
        public int age = 23;
        public abstract void study(); // abstract method 
    }

    // Subclass (inherit from Main)
    class Student extends Main{
        public int graduationYear = 2018;
        public void study(){ 
            // the body of the abstract method is provided here
            System.out.println("Studying all day long");
        }
    }



public class ModifiersNoAccess{
    //final if you don't want the ability to override existing attribute values, like a const in javasript
    final double PI = 3.14;

    //static method belongs to the class, not to any specific object. This means you can call it without creating an object of the class.
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();         // Call the static method
        ModifiersNoAccess.myStaticMethod();    // Or call it using the class name
        ModifiersNoAccess objFinal = new ModifiersNoAccess();
        System.out.println(objFinal.PI);
        // objFinal.PI = 5; will generate an error: cannot assign a value to a final variable
        Student objAbstract = new Student();
        System.out.println(objAbstract.fname);
        System.out.println(objAbstract.age);
        System.out.println(objAbstract.graduationYear);
        objAbstract.study(); // call abstract method
    }
}