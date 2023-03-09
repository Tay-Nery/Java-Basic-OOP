package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
     /*essa operçao valor total em estoque vai me retornar
     o preço multiplicado pela qqtidade em estoque*/
        return price * quantity;
    }
    /*Essa operaçao altera o valor do atributo quantity*/
    public void addProducts(int quantity){
        /*implementando a operação diferenciando o atributo qtty
        * do parâmetro qtty cha,ando o this*/

        this.quantity += quantity;
        //palavra reservada de auto referencia ao obj
        //esse comando soma o argumento qtty no atributo qtty da classe
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
}
