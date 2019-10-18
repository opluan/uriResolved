import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        String nomeVendedor;
        double salarioBruto;
        double vendasRealizadas;
        double salarioTotal;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        nomeVendedor = sc.nextLine();
        salarioBruto = sc.nextDouble();
        vendasRealizadas = sc.nextDouble();
        salarioTotal = salarioBruto + (vendasRealizadas * 0.15);
        
        System.out.println("TOTAL = R$ " + decimal.format(salarioTotal));
        
    }
 
}
