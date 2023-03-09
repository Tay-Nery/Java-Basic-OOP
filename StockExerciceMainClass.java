package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main (String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //declarando variável do tipo product. Tem q importar a classe Product
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity on Stock: ");
        product.price = sc.nextInt();

        System.out.println(product.name + "," + product.price + "," + product.quantity);

        sc.close();

    }
}
