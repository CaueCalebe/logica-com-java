package arrays;

public class IntroducaoArrays {
    public static void main(String[] args) {
        
        double[] notas = new double[4];
        
        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 3;
        notas[3] = 6;
        
        System.out.println("Tamanho do Array: " + notas.length);
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println(notas[i]);
        }
        
    }
}
