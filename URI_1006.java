import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        double A;
        double B;
        double C;
        double MEDIA;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.0");
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;
        
        System.out.println("MEDIA = " + decimal.format(MEDIA));
        
    }
 
}
