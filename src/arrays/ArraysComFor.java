package arrays;

import java.util.Scanner;

public class ArraysComFor {
    public static void main(String[] args) {
        
        double[] notas = new double[4];
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < notas.length; i++) {
           
            System.out.println("Digite a Nota " + (i + 1));
            notas[i] = teclado.nextDouble();
        }
        
        for (int i = 0; i < notas.length; i++) {
            
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        
        teclado.close();
        
        System.out.println("\nFim do Programa!");
    }
}
