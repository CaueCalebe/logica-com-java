package lacosderepeticaofor;

import java.util.Scanner;

public class TabuadaQualquerNumero {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---- Tabuada de um Número Inteiro Qualquer ----\n");
        
        System.out.print("Qual Tabuada você que saber? ");
        int numEscolhido = teclado.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(numEscolhido + " x " + i + " = " + (numEscolhido * i));
        }
        
        System.out.println("\nFim do Programa!");
    }
 
}
