package model;

public class Product {

    private static int idGenerator = 1; 
    
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.id = idGenerator++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return String.format("Id: %d | Name: %s | Price: R$%.2f | Quantity = %d", id, name, price, quantity);
    }

}
