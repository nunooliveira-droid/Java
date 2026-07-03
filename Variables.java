

public class Variables{
    public static void main(String[] args) {
        /* Data Types of variables in Java 
            byte
            short
            int
            long
            float
            double
            char
            string
            boolean

            syntax (type name = value); 
        */
       String name = "Nuno";
       int age = 24;

       //final is used to contante values and final variable names are written in uppercase

       final int BIRTH_DAY = 05;
       final int BIRTH_MONTH = 12;
       final int BIRTH_YEAR = 2001;
       final String BIRTH_DATE = BIRTH_DAY + "/" + BIRTH_MONTH + "/" + BIRTH_YEAR ;
       
       System.out.println("My name is " + name + " and i have " + age + " years");
       System.out.println("birth date: " + BIRTH_DATE);
    }
}