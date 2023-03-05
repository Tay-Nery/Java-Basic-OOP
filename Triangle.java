package entities;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {
    public double a;
    public double b;
    public double c;

    //Criar uma funçao/método que calcula a área
    /*essa não recebe parâmetros pois ela precisa apenas de a,b e c
     que ja estão dentro da classe*/

    public double area(){
        double p = (a + b+ c) / 2.0;
        return Math.sqrt(p* (p-a) * (p*b) * (p-c));

    }

}
