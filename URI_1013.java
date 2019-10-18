import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int primeiro;
        int segundo;
        int terceiro;
        int maiorPrimeiro;
        int maiorSegundo;
        
        Scanner sc = new Scanner(System.in);
        
        primeiro = sc.nextInt();
        segundo = sc.nextInt();
        terceiro = sc.nextInt();
        maiorPrimeiro = (primeiro + segundo + Math.abs(primeiro - segundo)) / 2;
        maiorSegundo = (maiorPrimeiro + terceiro + Math.abs(maiorPrimeiro - terceiro)) / 2;
        
        System.out.println(maiorSegundo + " eh o maior");
        
    }
 
}
