import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        int a;
        int b;
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(a <= b) {
        	if(b <= 2) {
        		System.out.println("nova"); 
        	} else if(b > 96) {
        		System.out.println("cheia");
        	}else if((b > 2 && b <= 96)) {
        		System.out.println("crescente");
        	}
        } else if(a > b) {
        	if(b <= 2) {
        		System.out.println("nova");
        	} else if((a <= 96 && a > 2) || (b <= 96 && b > 2)) {
        		System.out.println("minguante");
        	} else if(b > 96) {
        		System.out.println("cheia");
        	}
        } 

    }
 
}
