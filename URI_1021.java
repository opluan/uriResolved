import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        float N;
        int umCentavo;
        int cincoCentavos;
        int dezCentavos;
        int vinteCincoCentavos;
        int cinquentaCentavos;
        int umReal;
        int doisReais;
        int cincoReais;
        int dezReais;
        int vinteReais;
        int cinquentaReais;
        int cemReais;
        double troco;
        
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextFloat();
        cemReais = (int)N / 100;
        troco = N % 100;
        cinquentaReais = (int)troco / 50;
        troco = troco % 50;
        vinteReais = (int)troco / 20;
        troco = troco % 20;
        dezReais = (int)troco / 10;
        troco = troco % 10;
        cincoReais = (int)troco / 5;
        troco = troco % 5;
        doisReais = (int)troco / 2;
        troco = troco % 2;
        umReal = (int)troco;
        troco = troco % 1;
        cinquentaCentavos = (int)(troco * 2);
        troco = troco - (cinquentaCentavos / 2.0) + 0.001;
        vinteCincoCentavos = (int)(troco * 4);
        troco = troco - (vinteCincoCentavos / 4.0) + 0.001;
        dezCentavos = (int)(troco * 10);
        troco = troco - (dezCentavos / 10.0) + 0.001;
        cincoCentavos = (int)(troco * 20);
        troco = troco - (cincoCentavos / 20.0) + 0.001;
        umCentavo = (int)(troco * 100);
        
        System.out.println("NOTAS:");
        System.out.println(cemReais + " nota(s) de R$ 100.00");
        System.out.println(cinquentaReais + " nota(s) de R$ 50.00");
        System.out.println(vinteReais + " nota(s) de R$ 20.00");
        System.out.println(dezReais + " nota(s) de R$ 10.00");
        System.out.println(cincoReais + " nota(s) de R$ 5.00");
        System.out.println(doisReais + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(umReal + " moeda(s) de R$ 1.00");
        System.out.println(cinquentaCentavos + " moeda(s) de R$ 0.50");
        System.out.println(vinteCincoCentavos + " moeda(s) de R$ 0.25");
        System.out.println(dezCentavos + " moeda(s) de R$ 0.10");
        System.out.println(cincoCentavos + " moeda(s) de R$ 0.05");
        System.out.println(umCentavo + " moeda(s) de R$ 0.01");
        
    }
 
}
