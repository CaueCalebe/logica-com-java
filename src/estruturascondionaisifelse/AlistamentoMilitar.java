package estruturascondionaisifelse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main (String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu Nome: ");
        String nomePessoa = teclado.nextLine();
                
        System.out.println("Digite (M) para Masculino ou (F) para Feminino: ");
        String generoPessoa = teclado.next();
        
        System.out.println("Digite a Idade: ");
        int idadePessoa = teclado.nextInt();
        
        if (generoPessoa.equalsIgnoreCase("M") && idadePessoa >= 18) {
            
            System.out.println("" + nomePessoa + " seu Alistamento é Obrigatório!");
        }
        else if (generoPessoa.equalsIgnoreCase("M") && idadePessoa < 18) {
            
            System.out.println("" + nomePessoa + " seu Alistamento não está permitido!");
        }
        else if (generoPessoa.equalsIgnoreCase("F") && idadePessoa >= 18) {
            
            System.out.println("" + nomePessoa + " Você deseja se alistar?");
        }
        else {
            
            System.out.println("" + nomePessoa + " seu Alistamento não está permitido!");
        }
        
        System.out.println("Fim do Programa!!");
    }
}
