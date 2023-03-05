package application;
//Alt+Enter para importar a classe do pacote entities
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Problem -WITH OOP-
        //ler dados de dois triangulos x e y

        //Criando variáveis x e y do tipo Triangle
        Triangle x,y;

        //Instanciar o objeto para que ele exista
        x= new Triangle();
        y= new Triangle();

        //ler numero inteiro para guardar no atributo a do objeto x

        System.out.println("Enter Triangle X's measures: ");
        //leitura dos lados tri X e armazenamento e m cada um dos 3 atributos do obj x
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter Triangle Y's measures: ");
        //leitura dos lados tri Y e armazenamento e m cada um dos 3 atributos do obj y
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        /* cálculo da área tri X
        com formula da area */
        double p =(x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p-x.a) * (p - x.b) * (p - x.c));

        /* cálculo da área tri Y
        com formula da area */
        p =(y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p-y.a) * (p - y.b) * (p - y.c));

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
