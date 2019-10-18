import java.io.IOException;
import java.util.Scanner;
	
public class Main {
 
    public static void main(String[] args) throws IOException{
       
       int horaSaida;
       int duracaoViagem;
       int fusoHorario;
       int horaChegada;
       
       Scanner sc = new Scanner(System.in);
       
       horaSaida = sc.nextInt();
       duracaoViagem = sc.nextInt();
       fusoHorario = sc.nextInt();
       
       horaChegada = horaSaida + duracaoViagem + fusoHorario;
       
       if(horaChegada == 24) {
    	   horaChegada = 0;
       } else if(horaChegada < 0) {
    	   horaChegada += 24;
       } else if(horaChegada > 24){
    	   horaChegada -= 24;
       }
       
       System.out.println(horaChegada);
       
	}
	    
}
