package arrays;

import java.util.Scanner;

public class CalculoComArrays {
    public static void main(String[] args) {
        
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < array1.length; i++) {
            
            System.out.println("Vetor 1, Posição " + i + ": ");
            array1[i] = teclado.nextInt();
            
        }
        
        for (int i = 0; i < array2.length; i++) {
            
            System.out.println("Vetor 2, Posição " + i + ": ");
            array2[i] = teclado.nextInt();
            
        }
        
        System.out.println("\nVetor 3 Multiplicação\n");
        
        for (int i = 0; i < array3.length; i++) {
            
            array3[i] = array1[i] * array2[i];
            System.out.println("Resultado de " + array1[i] + " * " + array2[i] + " = " + array3[i]);
            
        }
        
        teclado.close();
        
        System.out.println("\nFim do Programa!");
    }
}
