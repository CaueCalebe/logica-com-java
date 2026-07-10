package switchcase;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main (String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número de (1) à (7): ");
        int numeroDia = teclado.nextInt();
        
        if (numeroDia == 1) {
            
            System.out.println("Dia 1 - Segunda-feira"); 
        }
        else if (numeroDia == 2) {
            
            System.out.println("Dia 2 - Terça-feira");
        }
        else if (numeroDia == 3) {
            
            System.out.println("Dia 3 - Quarta-feira");
        }
        else if (numeroDia == 4) {
            
            System.out.println("Dia 4 - Quinta-feira");
        }
        else if (numeroDia == 5) {
            
            System.out.println("Dia 5 - Sexta-feira");
        }
        else if (numeroDia == 6) {
            
            System.out.println("Dia 6 - Sábado");
        }
        else {
            
            System.out.println("Dia 7 - Domingo");
        }
        
        System.out.println("Fim do Programa");
    }
}
