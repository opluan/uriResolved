import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int numeroFuncionario;
        int horasTrabalhadas;
        double salarioHora;
        double salario;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        salarioHora = sc.nextDouble();
        salario = salarioHora * horasTrabalhadas;
        
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + decimal.format(salario));
        
    }
 
}
