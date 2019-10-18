import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int primeiroCodigo;
        int primeiraQuantidade;
        double primeiroValorUnitario;
        double primeiroValorTotal;
        
        int segundoCodigo;
        int segundaQuantidade;
        double segundoValorUnitario;
        double segundoValorTotal;
        
        double valorPagar;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        primeiroCodigo = sc.nextInt();
        primeiraQuantidade = sc.nextInt();
        primeiroValorUnitario = sc.nextDouble();
        primeiroValorTotal = (primeiroValorUnitario * primeiraQuantidade);
        
        segundoCodigo = sc.nextInt();
        segundaQuantidade = sc.nextInt();
        segundoValorUnitario = sc.nextDouble();
        segundoValorTotal = (segundoValorUnitario * segundaQuantidade);
        
        valorPagar = primeiroValorTotal + segundoValorTotal;
        
        System.out.println("VALOR A PAGAR: R$ " + decimal.format(valorPagar));
        
    }
 
}
