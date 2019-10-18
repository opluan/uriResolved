import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        double A;
        double B;
        double MEDIA;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00000");
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
        
        System.out.println("MEDIA = " + decimal.format(MEDIA));
        
    }
 
}
