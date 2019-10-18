import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
       float nUm;
       float nDois;
       float nTres;
       float nQuatro;
       float nExame;
       float media;
        
       Scanner sc = new Scanner(System.in);
       DecimalFormat decimal = new DecimalFormat("0.0");
       
       nUm = sc.nextFloat();
       nDois = sc.nextFloat();
       nTres = sc.nextFloat();
       nQuatro = sc.nextFloat();
       media = ((nUm * 2) + (nDois * 3) + (nTres * 4) + nQuatro) / 10;
       
       if(media >= 7.0) {
           System.out.println("Media: " + decimal.format(media));
           System.out.println("Aluno aprovado.");
       } else if(media >= 5.0 && media <= 6.9) {
           System.out.println("Media: " + decimal.format(media));
           System.out.println("Aluno em exame.");
           nExame = sc.nextFloat();
           System.out.println("Nota do exame: " + decimal.format(nExame));
           media = (media + nExame) / 2;
           if(media >= 5.0) {
               System.out.println("Aluno aprovado.");
               System.out.println("Media final: " + decimal.format(media));
           } else {
               System.out.println("Aluno reprovado.");
               System.out.println("Media final: " + decimal.format(media));
           }
       } else {
           System.out.println("Media: " + decimal.format(media));
           System.out.println("Aluno reprovado.");
       }
       
    }
 
}
