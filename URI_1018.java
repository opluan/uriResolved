import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int A;
        int umReal;
        int doisReais;
        int cincoReais;
        int dezReais;
        int vinteReais;
        int cinquentaReais;
        int cemReais;
        int troco;
        
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextInt();
        cemReais = A / 100;
        troco = A % 100;
        cinquentaReais = troco / 50;
        troco = troco % 50;
        vinteReais = troco / 20;
        troco = troco % 20;
        dezReais = troco / 10;
        troco = troco % 10;
        cincoReais = troco / 5;
        troco = troco % 5;
        doisReais = troco / 2;
        troco = troco % 2;
        umReal = troco;
        
        System.out.println(A);
        System.out.println(cemReais + " nota(s) de R$ 100,00");
        System.out.println(cinquentaReais + " nota(s) de R$ 50,00");
        System.out.println(vinteReais + " nota(s) de R$ 20,00");
        System.out.println(dezReais + " nota(s) de R$ 10,00");
        System.out.println(cincoReais + " nota(s) de R$ 5,00");
        System.out.println(doisReais + " nota(s) de R$ 2,00");
        System.out.println(umReal + " nota(s) de R$ 1,00");
        
    }
 
}
