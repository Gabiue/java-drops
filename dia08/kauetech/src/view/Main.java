package view;
import java.util.Scanner;
import service.ProductService;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService productService = new ProductService();

        boolean running = true;

        while (running){
            System.out.println("\n==== Sistema de Estoque - KaueTech ====");
            System.out.println("1. Adcionar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Buscar por nome");
            System.out.println("4. Atualizar estoque");
            System.out.println("5. Remover produto");
            System.out.println("6. Sair ");

            System.out.println("Escolha uma opção: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:

                    System.out.println("Digite o nome do produto:");
                    String name = sc.nextLine();

                    System.out.println("Digite o valor do produto:");
                    double price = sc.nextDouble();

                    System.out.println("Digite a quantidade do produto:");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    productService.addProduct(name, price, quantity);
                    break;
                
                case 2:
                    productService.listProduct();
                    break;

                 case 3:
                    System.out.println("Digite o nome do produto:");
                    name = sc.nextLine();
                    productService.searchByName(name);
                
                    break;

                case 4:
                    System.out.println("Digite o id do produto: ");
                    int id = sc.nextInt();
                    System.out.println("Digite a nova quantidade do produto: ");
                    quantity = sc.nextInt();
                    productService.updateQuantity(id, quantity);
                
                    break;

                case 5:
                    System.out.println("Digite o id do produto que deseja excluir: ");
                    id = sc.nextInt();
                    productService.removeProduct(id);
                
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    running = false; 
                    break;

                default: 
                System.out.println("Opção Invalida, tente novamente.");
            }
        }

        sc.close();
    }
}
