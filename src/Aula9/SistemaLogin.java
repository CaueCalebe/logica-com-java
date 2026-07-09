package Aula9;

import java.util.Scanner;

public class SistemaLogin {
    public static void main (String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o Nome do Usuário: ");
        String nomeUsuario = teclado.nextLine();
        
        if (nomeUsuario == null || nomeUsuario == "") {
            
            System.out.println("Usuário Inválido!");
        }
        else if (nomeUsuario.equals("admin") || nomeUsuario.equals("administrador")) {
            
            System.out.println("Usuário Inválido!");
        }
        else {
            
            System.out.println("" + nomeUsuario + " Cadastrado com Sucesso :)");
        }
        
        System.out.println("Fim do Programa!");
    }
}

// .equals(args) serve para comparar um objeto com outro, somente se a variável for uma STRING.