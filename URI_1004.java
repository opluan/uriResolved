import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int primeiroValor;
        int segundoValor;
        int PROD;
        
        Scanner sc = new Scanner(System.in);
        
        primeiroValor = sc.nextInt();
        segundoValor = sc.nextInt();
        PROD = primeiroValor * segundoValor;
        
        System.out.println("PROD = " + PROD);
        
    }
 
}
