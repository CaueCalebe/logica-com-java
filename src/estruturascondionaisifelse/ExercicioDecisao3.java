package estruturascondionaisifelse;

import java.util.Scanner;

public class ExercicioDecisao3 {
    public static void main (String[] args) {
        int numeroEscolhido;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        numeroEscolhido = teclado.nextInt();
        
        if (numeroEscolhido % 2 == 0) {
            
            System.out.println("" + numeroEscolhido + " é Par!");
        }
        else {
            
            System.out.println("" + numeroEscolhido + " é Ímpar!");
        }
        
        System.out.println("Fim do Programa!");
    }
}
