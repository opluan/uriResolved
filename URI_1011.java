import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        double R;
        double pi = 3.14159;
        double volume;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.000");
        
        R = sc.nextDouble();
        volume = ((double) 4/3) * pi * Math.pow(R, 3);
        
        System.out.println("VOLUME = " + decimal.format(volume));
        
    }
 
}
