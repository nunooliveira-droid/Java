public class Method{
    //static means that the method belongs to the Main class and not an object of the Main class.
    //void means that this method does not have a return value.
    static void myMethod() {
        System.out.println("This is my Method");
    }

    //Information can be passed to methods as a parameter. Parameters act as variables inside the method.
    static void Name(String fname, String lname, int age) {
        System.out.println("My name is " + fname + " " + lname + " and my age is " + age);
    }

    static int num(int x){
        return 5 + x;
    }

    public static void main(String[] args) {
        myMethod();
        Name("Nuno", "Oliveira", 25);
        System.out.println(num(3));
    }
}