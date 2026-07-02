package Aula3;

import java.util.Scanner;

public class CalcularPorcentagemSalario {
    //public static void main(String[] args){
      double resultadoSalario;
      
      Scanner teclado = new Scanner(System.in);
      
      System.out.println("Escreva o valor do seu Salário: ");
      double salario = teclado.nextDouble();
      
      System.out.println("Escreva o percentual do salário: ");
      double percentualSalario = teclado.nextDouble();
      
      resultadoSalario = salario * (percentualSalario / 100);
      
      System.out.println("O Resultado do Percentual do Salário é: R$" + resultadoSalario);
      
    }
}
