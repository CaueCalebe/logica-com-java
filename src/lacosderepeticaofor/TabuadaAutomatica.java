package lacosderepeticaofor;

public class TabuadaAutomatica {
    public static void main(String[] args) {
        
        System.out.println("---- Tabuada de 1 à 10 Automática ----\n");
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("\n");
            
            for (int j = 1; j <= 10; j++) {
                
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
        
        System.out.println("\nFim do Programa!");
    }
  
}
