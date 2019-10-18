import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.0000");
        
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * (Math.pow(raio, 2));
        
        System.out.println("A=" + decimal.format(area));
        
    }
 
}
