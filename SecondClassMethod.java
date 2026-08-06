public class SecondClassMethod{

    int modelYear;
    String modelName;

    public SecondClassMethod(int year, String name) {
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args) {
        ClassMethod newCar = new ClassMethod();
        SecondClassMethod myObj = new SecondClassMethod(1969, "Mustang");
        newCar.fullThrottle();
        newCar.speed(220);
        System.out.println(newCar.x);
        System.out.println(myObj.modelYear + " " + myObj.modelName);
    }
}