class OuterClass{
    int x = 10;

    class InnerClass{
        int y = 5;
    }

    static class Static{
        int z = 20;
    }
}


public class Inner{
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        OuterClass.Static myStatic = new OuterClass.Static();// Static class dont need to create an outer object
        System.out.println(myInner.y + myOuter.x);// if one class is private it will give an error
        System.out.println(myStatic.z);
    }
}