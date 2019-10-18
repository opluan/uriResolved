import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        int a;
        int b;
        int c;
        int d;
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if(a >= b) {
            if(b >= c) { // a >= b >= c
                System.out.println(c);
                System.out.println(b);
                System.out.println(a + "\n");
            } else { // a >= b && b < c
                if(a >= c) { 
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a + "\n");
                 } else { // a >= b && a < c
                    System.out.println(b);
                    System.out.println(a);
                    System.out.println(c + "\n");
                 }
            }
        } else {
            if(b >= c) {
                if(a >= c) {
                    System.out.println(c);
                    System.out.println(a);
                    System.out.println(b + "\n");
                } else {
                    System.out.println(a);
                    System.out.println(c);
                    System.out.println(b + "\n");
                }
            } else {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c + "\n");
            }
        }
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
 
}
