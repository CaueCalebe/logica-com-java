package Aula7;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main (String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu Nome: ");
        String nomePessoa = teclado.nextLine();
        
        System.out.println("Digite seu Salário: ");
        double salarioPessoa = teclado.nextDouble();
        
        if (salarioPessoa <= 2428.80) {
            
            System.out.println("" + nomePessoa + " é Isento!"); 
        }
        else if (salarioPessoa >= 2428.81 && salarioPessoa <= 2826.65) {
        
            System.out.println("" + nomePessoa + " a Alíquota correspondente é de 7,5%");
        }
        else if (salarioPessoa >= 2826.66 && salarioPessoa <= 3751.05) {
           
            System.out.println("" + nomePessoa + " a Alíquota correspondente é de 15%");    
        }
        else if (salarioPessoa >= 3751.06 && salarioPessoa <= 4664.68) {
          
            System.out.println("" + nomePessoa + " a Alíquota correspondente é de 22,5%");   
        }
        else {
                
            System.out.println("" + nomePessoa + " a Alíquota correspondente é de 27,5%");    
        }
        
        System.out.println("Fim do Programa!!");
    }
}
