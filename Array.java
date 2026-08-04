public class Array{
    public static void main(String[] args){
        int[][] matriz= {{1 , 4, 6}, {2, 7, 8}};

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
}