import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        float a;
        float b;
        float c;
        float d;
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        
        // Colocar o maior em a
        
        if(c > b) {
        	if(c > a) { // c é O maior de todos
        		d = c;
        		c = a;
        		a = d;
        	} // a ja é O maior
        } else { // c < b
        	if(b > a) { // b é O maior de todos
        		d = b;
        		b = a;
        		a = d;
        	} // a ja é O maior
        }
        
        // Colocar o menor em c
        
        if(b < c) { // b é o menor
        	d = b;
        	b = c;
        	c = d;
        } // c ja é O menor

        if(a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
        	if(Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2)) {
            System.out.println("TRIANGULO RETANGULO");
	        }
	        if(Math.pow(a,2) > Math.pow(b,2) + Math.pow(c,2)) {
	            System.out.println("TRIANGULO OBTUSANGULO");
	        }
	        if(Math.pow(a,2) < Math.pow(b,2) + Math.pow(c,2)) {
	            System.out.println("TRIANGULO ACUTANGULO");
	        }
	        if(a == b && a == c) {
	            System.out.println("TRIANGULO EQUILATERO");
	        }
	        if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
	            System.out.println("TRIANGULO ISOSCELES");
	        }
        }
       

    }
 
}
