import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int rendimentoMotor = 12; // km/L
        int tempoViagem; // em horas
        int velocidadeMedia; // km/h
        int distanciaPercorrida;
        float estimativaLitros;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.000");
        
        tempoViagem = sc.nextInt();
        velocidadeMedia = sc.nextInt();
        
        distanciaPercorrida = velocidadeMedia * tempoViagem;
        estimativaLitros = (float)distanciaPercorrida / rendimentoMotor;
        
        System.out.println(decimal.format(estimativaLitros));
        
    }
 
}
