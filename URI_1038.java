import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int codigoItem;
        int quantidadeItem;
        double valorConta;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        codigoItem = sc.nextInt();
        quantidadeItem = sc.nextInt();
        
        if(codigoItem == 1) {
            valorConta = quantidadeItem * 4.0;
            System.out.println("Total: R$ " + decimal.format(valorConta));
        } else if(codigoItem == 2) {
            valorConta = quantidadeItem * 4.5;
            System.out.println("Total: R$ " + decimal.format(valorConta));
        } else if(codigoItem == 3) {
            valorConta = quantidadeItem * 5.0;
            System.out.println("Total: R$ " + decimal.format(valorConta));
        } else if(codigoItem == 4) {
            valorConta = quantidadeItem * 2.0;
            System.out.println("Total: R$ " + decimal.format(valorConta));
        } else if(codigoItem == 5) {
            valorConta = quantidadeItem * 1.5;
            System.out.println("Total: R$ " + decimal.format(valorConta));
        }
       
    }
 
}
