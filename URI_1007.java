import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int A;
        int B;
        int C;
        int D;
        int DIFERENCA;
        
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        DIFERENCA = (A * B - C * D);
        
        System.out.println("DIFERENCA = " + DIFERENCA);
        
    }
 
}
