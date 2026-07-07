package Aula5;

import java.util.Scanner;

public class ExercicioDecisao2 {
    public static void main (String[] args) {
        String nomePessoa;
        double salarioPessoa;
        double percentualSalario30;
        double percentualSalario15;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        nomePessoa = teclado.nextLine();
        
        System.out.println("Digite o seu salário: ");
        salarioPessoa = teclado.nextDouble();
        
        if (salarioPessoa >= 4500) { 
            percentualSalario30 = salarioPessoa * 0.3;
            
            System.out.println("" + nomePessoa + " 30% do seu salário é: " + percentualSalario30);
        }
        else {
            percentualSalario15 = salarioPessoa * 0.15;
            
            System.out.println("" + nomePessoa + " 15% do seu salário é: " + percentualSalario15);
        }
        
        System.out.println("Fim do Programa!");
    }
}

//Numa equação não se usa "0,5" mas sim "0.5" por exemplo