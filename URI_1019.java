import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int N; // em segundos
        int horas; // 3600 segundos
        int minutos; // 60 segundos
        int segundos;
        int resto;
        
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        horas = N / 3600;
        resto = N % 3600;
        minutos = resto / 60;
        resto = resto % 60;
        segundos = resto;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
    }
 
}
