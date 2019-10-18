import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int distanciaPercorrida;
        int afastamento = 2;
        int distanciaTempo;
        
        Scanner sc = new Scanner(System.in);
        
        distanciaPercorrida = sc.nextInt();
        distanciaTempo = distanciaPercorrida * afastamento;
        
        System.out.println(distanciaTempo + " minutos");
        
    }
 
}
