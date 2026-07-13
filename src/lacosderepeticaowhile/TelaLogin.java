package lacosderepeticaowhile;

import java.util.Scanner;

public class TelaLogin {
    public static void main(String[] args) {
        
        String login = "Cauê Calebe";
        String senha = "Calebe0716";
        
        Scanner teclado = new Scanner(System.in);
        
        do {
          
            System.out.println("\n---- Tela de Login ----\n");
        
            System.out.println("Login: ");
            login = teclado.nextLine();
        
            System.out.println("\nSenha: ");
            senha = teclado.nextLine();
            
            if (login.equals("Cauê Calebe") && senha.equals("Calebe0716")) {
                
                System.out.println("\nACESSO CONCEDIDO!");
            }
            else if (login == "" || senha == "") {
                
                System.out.println("\nLOGIN NÃO LOCALIZADO!");
            }
            else {
                
                System.out.println("\nACESSO NEGADO!");
            }
            
        } while (!login.equals("Cauê Calebe") || !senha.equals("Calebe0716"));
        
        teclado.close();
        
        System.out.println("\nFim do Programa!!");
        
    }
 
}
