package view;

import model.User;
import service.UserService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner sc = new Scanner(System.in);

        while (true){
            exibirMenu();
            String opcao = sc.nextLine();

            switch (opcao){
                case "1": 
                    cadastrarUsuario(userService, sc);
                    break;

                case "2":
                    listarUsuarios(userService);
                    break;
                
                case "3":
                    buscarUsuarioPorEmail(userService, sc);
                    break;
                
                case "4":
                    atualizarIdadeUsuario(userService, sc);
                    break;

                case "5":
                    removerUsuario(userService, sc);
                    break;
                
                case "6":
                    System.out.println("Saindo do sistema...");
                    sc.close();
                    return;

                default: 
                    System.out.println("Opção invalida, tente novamente!!");
            }

            System.out.println();
        }

    }

    private static void exibirMenu(){
        System.out.println("=== Menu ===");
        System.out.println("1. Cadastrar usuário");
        System.out.println("2. Listar usuários");
        System.out.println("3. Buscar usuário por email");
        System.out.println("4. Atualizar idade do usuário");
        System.out.println("5. Remover usuário por email");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarUsuario(UserService service, Scanner sc){
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        boolean sucesso = service.addUser(nome, email, idade);
        if(sucesso){
            System.out.println("Usuario cadastrado com sucesso!!");
        }else {
            System.out.println("ERRO: Email invalido ou já cadastrado!!");
        }
    }
    private static void listarUsuarios(UserService service) {
        List<User> usuarios = service.getAllUsers();
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Usuários cadastrados:");
            for (User user : usuarios) {
                System.out.println(user);
            }
        }
    }

    private static void buscarUsuarioPorEmail(UserService service, Scanner scanner) {
        System.out.print("Digite o email do usuário: ");
        String email = scanner.nextLine();

        User user = service.findUserByEmail(email);
        if (user != null) {
            System.out.println("Usuário encontrado: " + user);
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    private static void atualizarIdadeUsuario(UserService service, Scanner scanner) {
        System.out.print("Digite o email do usuário: ");
        String email = scanner.nextLine();

        System.out.print("Nova idade: ");
        int novaIdade = Integer.parseInt(scanner.nextLine());

        boolean sucesso = service.updateUserAge(email, novaIdade);
        if (sucesso) {
            System.out.println("Idade atualizada com sucesso.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    private static void removerUsuario(UserService service, Scanner scanner) {
        System.out.print("Digite o email do usuário a remover: ");
        String email = scanner.nextLine();

        boolean sucesso = service.removeUserByEmail(email);
        if (sucesso) {
            System.out.println("Usuário removido com sucesso.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
