import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {

        float a;
        float b;
        float c;
        float perimetroTriangulo;
        float areaTrapezio;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.0");
        
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        perimetroTriangulo = a + b + c;
        areaTrapezio = ((a + b) * c) / 2;
        
        /*
        
        Para construir um triângulo é necessário que a medida de qualquer um dos lados
        seja menor que a soma das medidas dos outros dois e maior que o valor absoluto
        da diferença entre essas medidas.
        
        */
        
        if(Math.abs(b - c) < a && a < b + c) {
            if(Math.abs(a - c) < b && b < a + c) {
                if(Math.abs(a - b) < c && c < a + b) {
                    System.out.println("Perimetro = " + decimal.format(perimetroTriangulo));
                }
            }
        } else {
            System.out.println("Area = " + decimal.format(areaTrapezio));
        }
        
    }
 
}
