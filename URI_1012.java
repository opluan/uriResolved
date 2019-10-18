import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        double A;
        double B;
        double C;
        double pi = 3.14159;
        double areaTriangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.000");
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        areaTriangulo = A * (C/2);
        areaCirculo = pi * Math.pow(C, 2);
        areaTrapezio = (A + B) * (C/2);
        areaQuadrado = Math.pow(B, 2);
        areaRetangulo = A * B;
        
        System.out.println("TRIANGULO: " + decimal.format(areaTriangulo));
        System.out.println("CIRCULO: " + decimal.format(areaCirculo));
        System.out.println("TRAPEZIO: " + decimal.format(areaTrapezio));
        System.out.println("QUADRADO: " + decimal.format(areaQuadrado));
        System.out.println("RETANGULO: " + decimal.format(areaRetangulo));
        
    }
 
}
