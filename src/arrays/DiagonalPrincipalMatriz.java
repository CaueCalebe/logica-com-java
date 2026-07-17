package arrays;

public class DiagonalPrincipalMatriz {
    public static void main(String[] args) {
        
        int[][] arrayMulti1 = new int[3][3];
        
        arrayMulti1[0][0] = 1;
        arrayMulti1[0][1] = 2;
        arrayMulti1[0][2] = 3;
        arrayMulti1[1][0] = 4;
        arrayMulti1[1][1] = 5;
        arrayMulti1[1][2] = 6;
        arrayMulti1[2][0] = 7;
        arrayMulti1[2][1] = 8;
        arrayMulti1[2][2] = 9;
        
        for (int i = 0; i < arrayMulti1.length; i++) {
            
            for (int j = 0; j < arrayMulti1[i].length; j++) {
               
               System.out.println("["+i+"]" + "["+j+"] = " + arrayMulti1[i][j]);   
                
            }
            
        }
        
        System.out.println("\nValor da Diagonal Principal: " + (arrayMulti1[0][0] * arrayMulti1[1][1] * arrayMulti1[2][2]));
        
        System.out.println("\nFim do Programa!");
    }
}
