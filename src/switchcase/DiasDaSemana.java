package switchcase;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main (String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número de (1) à (7): ");
        int numeroDia = teclado.nextInt();
        
        switch (numeroDia) {
            case 1:
                System.out.println("Dia 1 - Segunda-feira");
                break;
            case 2:
                System.out.println("Dia 2 - Terça-feira");
                break;
            case 3:
                System.out.println("Dia 3 - Quarta-feira");
                break;
            case 4:
                System.out.println("Dia 4 - Quinta-feira");
                break;
            case 5:
                System.out.println("Dia 5 - Sexta-feira");
                break;
            case 6:
                System.out.println("Dia 6 - Sábado");
                break;
            default:
                System.out.println("Dia 7 - Domingo");
                break;
        }
        
        System.out.println("Fim do Programa");
    }
}
