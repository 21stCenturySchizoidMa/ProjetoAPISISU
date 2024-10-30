package Notas;

import java.util.Scanner;
public class CalcularNotas {
        public  double media;

   public double calcularNotas(double nota1, double nota2, double nota3, double nota4, double nota5) {
       Scanner sc = new Scanner(System.in);
       System.out.println("digite sua nota de matematica");
       nota1 = sc.nextDouble();
       System.out.println("digite sua nota de ciencias da natureza");
       nota2 = sc.nextDouble();
       System.out.println("digite sua nota de linguagens");
       nota3 = sc.nextDouble();
       System.out.println("digite sua nota de humanas");
       nota4 = sc.nextDouble();
       System.out.println("digite sua nota da redacao");
       nota5 = sc.nextDouble();



       media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
       return media;

   }
    public double getMedia() {
       return media;
    }

}
