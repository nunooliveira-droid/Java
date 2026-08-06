public class ClassMethod{
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    //Methods can be called in another file
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " +  maxSpeed);
    }

    int x;

    //class contructor for ClassMethod class
    //A constructor in Java is a special method that is used to initialize objects.
    public ClassMethod(){
        x = 20;
    }

    public static void main(String[] args) {
        ClassMethod myCar = new ClassMethod();
        myCar.fullThrottle();
        myCar.speed(200);
        System.out.println(myCar.x);
    }
}