package Aula8;

import java.util.Scanner;

public class TorneioNatacao {
    public static void main (String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o Nome do Participante: ");
        String nomeParticipante = teclado.nextLine();
        
        System.out.println("Digite a Idade do Participante: ");
        int idadeParticipante = teclado.nextInt();
        
        if (idadeParticipante <= 10) {
            
            System.out.println("" + nomeParticipante + " Participará da categoria Infantil!");
        }
        else if (idadeParticipante >= 11 && idadeParticipante <= 15) {
            
            System.out.println("" + nomeParticipante + " Participará da categoria Juvenil!");
        }
        else if (idadeParticipante >= 16 && idadeParticipante <= 19) {
            
            System.out.println("" + nomeParticipante + " Participará da categoria Pré-adulto!");
        }
        else {
            
            System.out.println("" + nomeParticipante + " Participará da categoria Adulto!");
        }
        
        System.out.println("Fim do Programa!!");
    }
}
