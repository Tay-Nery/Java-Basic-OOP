package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Problem -WITHOUT OOP-
        //ler dados de dois triangulos x e y

        //três variaveis para os 3 lados dos tri x e y

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter Triangle X's measures: ");
        //leitura dos lados tri X
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter Triangle Y's measures: ");
        //leitura dos lados tri Y
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        /* cálculo da área tri X
        com formula da area */
        double p =(xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p-xA) * (p - xB) * (p - xC));

        /* cálculo da área tri Y
        com formula da area */
        p =(yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p-yA) * (p - yB) * (p - yC));

        System.out.println("Triangle X's area: " + areaX);
        System.out.println("Triangle Y's area: " + areaY);

        //Teste para saber qual é a maior área
        if(areaX > areaY) {
            System.out.println("Larger area: Triangle X");
        }else{
            System.out.println("Larger area: Triangle Y");
        }

        sc.close();
    }
}
