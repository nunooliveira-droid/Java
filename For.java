public class For{
    public static void main(String[] args) {
        String msg = "Isto e uma mensagem";
        for(int i = 0; i < msg.length(); i++){
            System.out.println(i + " -> " + msg.charAt(i));
        }
        
        //Matriz
        for(int ii= 1; ii <= 3; ii++){
            for(int j = 0; j <= 2; j++){
                System.out.print( ii + j + " ");
            }
            System.out.println();
        }

        //for each
        int[] numbers = {10, 20, 30, 40};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}