public class Encapsulation{
    public static void main(String[] args){
        Person objPerson = new Person();
        objPerson.setName("John"); // Set the value of the name variable to "John"
        System.out.println(objPerson.getName());

        // error objPerson.name = "John";
        // error System.out.println(objPerson.name);
    }
}