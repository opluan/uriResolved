import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int X;
        float Y;
        float consumo;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.000");
        
        X = sc.nextInt();
        Y = sc.nextFloat();
        consumo = X / Y;
        
        System.out.println(decimal.format(consumo) + " km/l");
        
    }
 
}
