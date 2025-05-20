import java.util.Scanner;
import service.TaskManager;

public class Main{
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        
        boolean executando = true;
        
        while(executando){
            System.out.println("\n========== MENU ============");
            System.out.println("1. Adcionar tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar como concluida");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Sair");
            
            int opcao = scanner.nextInt();
            
            switch (opcao){
                case 1:
                    scanner.nextLine();
                    System.out.println("Descricao da Tarefa");
                    String descricao = scanner.nextLine();
                    System.out.println("prioridade (alta, media ou baixa)");
                    String prioridade = scanner.nextLine();
                    manager.adicionarTarefa(descricao, prioridade);
                    break;
                
                case 2:
                    manager.ListarTarefa();
                    break;
                
                case 3: 
                    System.out.println("Digite o ID da tarefa concluida");
                    int idConcluir = scanner.nextInt();
                    scanner.nextLine();
                    boolean marcou = manager.concluirTarefa(idConcluir);
                    
                    if(marcou){
                        System.out.println("Tarefa concluida com sucesso");    
                    }else{
                        System.out.println("Tarefa nao encontrada");
                        
                    }
                    break;
                    
                    case 4:
                    System.out.println("Id da tarefa a ser removida");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine();
                    boolean removeu = manager.removerTarefa(idRemover);
                    
                    if(removeu){
                        System.out.println("Tarefa Removida");
                    }
                    else{
                        System.out.println("Tarefa não encontrada");
                    }
                    break;
                    
                    case 5:
                    executando = false;
                    System.out.println("Encerrando...");
                    break;
                
                    default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scanner.close();
    }
    
}