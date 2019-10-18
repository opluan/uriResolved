import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int A;
        int B;
        int C;
        int D;
        
        Scanner sc = new Scanner(System.in);
       
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        if(B > C) {
            if(D > A) {
                if(C + D > A + B) {
                    if(C >= 0 && D >= 0) {
                        if(A % 2 == 0) {
                            System.out.println("Valores aceitos");
                        } else {
                            System.out.println("Valores nao aceitos");
                        }
                    } else {
                        System.out.println("Valores nao aceitos");
                    }
                } else {
                    System.out.println("Valores nao aceitos");
                }
            } else {
                System.out.println("Valores nao aceitos");
            }
        } else {
            System.out.println("Valores nao aceitos");
        }
        
    }
 
}
