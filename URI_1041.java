import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        float x;
        float y;
        
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextFloat();
        y = sc.nextFloat();
        
        if(x > 0 && y > 0) {
            System.out.println("Q1");
        } else if(x > 0 && y == 0) {
            System.out.println("Eixo X");
        } else if(x > 0 && y < 0) {
            System.out.println("Q4");
        } else if(x < 0 && y > 0) {
            System.out.println("Q2");
        } else if(x < 0 && y == 0) {
            System.out.println("Eixo X");
        } else if(x < 0 && y < 0) {
            System.out.println("Q3");
        } else if(x == 0 && y > 0) {
            System.out.println("Eixo Y");
        } else if(x == 0 && y < 0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Origem");
        }
        
    }
 
}
