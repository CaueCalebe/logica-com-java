package lacosderepeticaowhile;

import java.util.Scanner;

public class MenuWhile {
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        int numeroDigitado = 0;
        
        do {
            
            System.out.println("---- Menu Navegável ----\n");
            System.out.println("Digite um Número de (1) à (3): \n");
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            numeroDigitado = teclado.nextInt();
        }
        while (numeroDigitado != 3);
        
        System.out.println("\nFim do Programa!");
    }
}
