package switchcase;

import java.util.Scanner;

public class TipoContaBancaria {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---- Escolha o Tipo da Conta Bancária ----\n");
        System.out.println("1 - Conta Poupança");
        System.out.println("2 - Conta Corrente");
        System.out.println("3 - Conta Investimento");
        int escolhaConta = teclado.nextInt();
        
        switch (escolhaConta) {
            
            case 1:
                System.out.println("Oferece 0.05% de Juros!");
                break;
            case 2:
                System.out.println("Oferece 0.02% de Juros!");
                break;
            case 3:
                System.out.println("Oferece 0.1% de Juros!");
                break;
            default:
                System.out.println("Número Inválido!");
        }
        
        System.out.println("Fim do Programa!");
    }
 
}
