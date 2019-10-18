import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        float xUm;
        float yUm;
        float xDois;
        float yDois;
        double distancia;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.0000");
        
        xUm = sc.nextFloat();
        yUm = sc.nextFloat();
        xDois = sc.nextFloat();
        yDois = sc.nextFloat();
        distancia = Math.sqrt(Math.pow((xDois - xUm), 2) + Math.pow((yDois - yUm), 2));
        
        System.out.println(decimal.format(distancia));
        
    }
 
}
