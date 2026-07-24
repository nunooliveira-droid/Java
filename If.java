import java.util.Scanner;

public class If{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Is it rainning(true or false) ?");

        boolean rain = myObj.nextBoolean();

        if(rain){
            System.out.println("It is rainning");
        }else{
            System.out.println("It's not rainning");
        }

        //Short hand if... else
        //Syntaxe variable = (condition) ? expressionTrue :  expressionFalse;

        String result = (rain) ? "Ternary expression if true" : "Ternary expression if false";
        System.out.println(result);

        //this method uses a variable to store the result, it can be printed directely intead of storing

        System.out.println((rain) ? "Another ternary expression if true" : "Another ternary expression if false");

        //Nested Ternary

        int time = 22;
        String resultTime = (time < 12) ? "Good morning." : 
        (time < 18) ? "Good afternoon." : 
        "Good evening.";
        System.out.println(resultTime);
    }
}