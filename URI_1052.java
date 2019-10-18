import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		int mes;
		
		String[] meses = new String[12];
		Scanner sc = new Scanner(System.in);

		mes = sc.nextInt();
		
		meses[0] = "January";
		meses[1] = "February";
		meses[2] = "March";
		meses[3] = "April";
		meses[4] = "May";
		meses[5] = "June";
		meses[6] = "July";
		meses[7] = "August";
		meses[8] = "September";
		meses[9] = "October";
		meses[10] = "November";
		meses[11] = "December";
		
		System.out.println(meses[mes - 1]);
		
	}

}
