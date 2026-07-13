package lacosderepeticaowhile;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        int contador = 1;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---- Contagem de Números Ímpares ----\n");
        
        System.out.println("Digite um Número para a Contagem: ");
        int numeroDigitado = teclado.nextInt();
        
        while (contador <= numeroDigitado) {
            
            System.out.println("Número: " + contador);
            contador = contador + 2;
        }
        
        System.out.println("\nFim do Programa!");
    }
}
