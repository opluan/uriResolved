import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {

		double salario;
		double reajuste;
		double salarioReajustado;

		Scanner sc = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");

		salario = sc.nextDouble();

		if(salario > 0 && salario <= 400) {
			reajuste = salario * 0.15;
			salarioReajustado = salario + reajuste;
			System.out.println("Novo salario: " + decimal.format(salarioReajustado));
			System.out.println("Reajuste ganho: " + decimal.format(reajuste));
			System.out.println("Em percentual: 15 %");
		} else if(salario > 400 && salario <= 800) {
			reajuste = salario * 0.12;
			salarioReajustado = salario + reajuste;
			System.out.println("Novo salario: " + decimal.format(salarioReajustado));
			System.out.println("Reajuste ganho: " + decimal.format(reajuste));
			System.out.println("Em percentual: 12 %");
		} else if(salario > 800 && salario <= 1200) {
			reajuste = salario * 0.1;
			salarioReajustado = salario + reajuste;
			System.out.println("Novo salario: " + decimal.format(salarioReajustado));
			System.out.println("Reajuste ganho: " + decimal.format(reajuste));
			System.out.println("Em percentual: 10 %");
		} else if(salario > 1200 && salario <= 2000) {
			reajuste = salario * 0.07;
			salarioReajustado = salario + reajuste;
			System.out.println("Novo salario: " + decimal.format(salarioReajustado));
			System.out.println("Reajuste ganho: " + decimal.format(reajuste));
			System.out.println("Em percentual: 7 %");
		} else if(salario > 2000) {
			reajuste = salario * 0.04;
			salarioReajustado = salario + reajuste;
			System.out.println("Novo salario: " + decimal.format(salarioReajustado));
			System.out.println("Reajuste ganho: " + decimal.format(reajuste));
			System.out.println("Em percentual: 4 %");
		}

	}

}
