import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {

		double renda;
		double imposto;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");

		renda = sc.nextDouble();
		
		if(renda <= 2000) {
			System.out.println("Isento");
		} else if(renda > 2000 && renda <= 3000) {
			imposto = (renda - 2000) * 0.08;
			System.out.println("R$ " + decimal.format(imposto));
		} else if(renda > 3000 && renda <= 4500) {
			imposto = ((renda - 3000) * 0.18) + (1000 * 0.08);
			System.out.println("R$ " + decimal.format(imposto));
		} else if(renda > 4500) {
			imposto = ((renda - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
			System.out.println("R$ " + decimal.format(imposto));
		}
		
	}

}
