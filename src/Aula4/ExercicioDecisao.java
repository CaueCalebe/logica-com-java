package Aula4;

import java.util.Scanner;

public class ExercicioDecisao {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu Nome: ");
        String nomePessoa = teclado.nextLine();
        
        System.out.println("Digite a sua Idade: ");
        int idadePessoa = teclado.nextInt();
        
        if(idadePessoa >= 18){
            
            System.out.println("" + nomePessoa + " é Adulto!");
            
        }
        else {
            
            System.out.println("" + nomePessoa + " não é Adulto!");
        }
        
        System.out.println("Fim do Programa!!");
    }
}

//O nextLine seve para ler os espaços em branco entre as strings