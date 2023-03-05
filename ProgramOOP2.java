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

        // chama o método de cálculo da área tri X
        double areaX = x.area();

        // chama o método de cálculo da área tri Y
        double areaY = y.area();

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
