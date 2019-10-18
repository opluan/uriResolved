import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        double A;
        double B;
        double C;
        double delta;
        double xUm;
        double xDois;
            
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00000");
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        delta = (Math.pow(B,2)) - (4 * A * C);
        xUm = (-B + Math.sqrt(delta)) / (2 * A);
        xDois = (-B - Math.sqrt(delta)) / (2 * A);
        
        if(delta >= 0 && A != 0) {
            System.out.println("R1 = " + decimal.format(xUm));
            System.out.println("R2 = " + decimal.format(xDois));
        } else {
            System.out.println("Impossivel calcular");
        }
       
    }
 
}
