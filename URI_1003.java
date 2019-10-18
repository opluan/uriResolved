import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int A;
        int B;
        int SOMA;
        
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextInt();
        B = sc.nextInt();
        SOMA = A + B;
        
        System.out.println("SOMA = " + SOMA);
        
    }
 
}
