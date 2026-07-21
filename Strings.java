public class Strings{
    public static void main(String[] args) {
        String txt = "Hello World";

        // Method lenght to messaure string lenght
        System.out.println("String Lenght: " + txt.length());

        //Method toUpperCase to change all string characters to upper case
        System.out.println("String in upper: " + txt.toUpperCase());
        //Method toUpperCase to change all string characters to lower case
        System.out.println("String in upper: " + txt.toLowerCase());

        //Method indexOf() to know where is the position of a specified text in string
        System.out.println("Index of 'Hello': " + txt.indexOf("Hello"));

        //Method charAt() to know the character of a certain position
        System.out.println("Letter of the 0 index : " + txt.charAt(0));

        for(int i = 0; i < txt.length(); i++){
            System.err.println(txt.charAt(i));
            char letterOfTxt = txt.charAt(i);
            System.out.println(txt.indexOf(letterOfTxt));
        }

        String txt2 = "Hello World";
        String txt3 = " New text ";

        //Method equals() to compare strings
        System.out.println(txt.equals(txt2));
        System.out.println(txt.equals(txt3));

        //Method trim() to remove empty spaces from beginning and end of string
        System.out.println("After Trim: " + txt3.trim());

        //Method concat to replace + 
        System.out.println(txt.concat(txt3).concat(txt2));

        /*
        Special Characters
        \'	'	Single quote
        \"	"	Double quote
        \\	\	Backslash
        \n	New Line	
        \t	Tab	
        \b	Backspace	
        \r	Carriage Return	
        \f	Form Feed
        */

       System.out.println("\'single quote\', \"Double quote\" and \n Newline \\backslash");
    }
}