package service;

import model.Product;
import java.util.ArrayList;
import java.util.List;
 
public class ProductService {
    
    private List<Product> productList;

    public ProductService(){
        this.productList = new ArrayList<>();
    }

    public void addProduct(String name, double price, int quantity){
        Product product = new Product( name,  price, quantity);
        productList.add(product);
        System.out.println("Produto adicionado com sucesso!!");
    }

    public void listProduct(){
        if(productList.isEmpty()){
            System.out.println("Nenhum produto cadastrado!!");
            return;
        }
        for(Product p : productList){
            System.out.println(p);
        }
    }

    public void searchByName(String name){
        boolean found = false;

        for(Product p : productList){
            if(p.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(p);
                found = true;
            }
        }
        if(!found){
            System.out.println("Produto não encontrado!!");
        }
    }

    public void updateQuantity(int id, int newQuantity){
        for(Product p : productList ){
            if (p.getId() == id){
                p.setQuantity(newQuantity);
                System.out.println("Quantidade atualizada com sucesso");
                return;
            }
        }
        System.out.println("Produto com ID" +id+ "Não encontrado");
    }

    public void removeProduct(int id ){
        for(Product p : productList){
            if(p.getId() == id){
                productList.remove(p);
                System.out.println("Produto removido com sucesso!!");
                return;
            }
        }
        System.out.println("Produto com ID" +id+ "Não encontrado");
    }


}
