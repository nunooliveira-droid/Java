class Car{
    protected String brand = "Ford"; // Car attribute
    public void honk(){ // Car method
        System.out.println("Tuut, Tuut!");
    }
}

public class Inheritance extends Car {
    private String modelName = "Mustang";    // Inheritance attribute
    public static void main(String[] args) {
        Inheritance myCar = new Inheritance();

        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
