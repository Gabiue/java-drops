import java.util.Scanner;
import service.TaskManager;
import model.Prioridade;
import util.ConsoleUI;

public class Main{
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        
        boolean executando = true;
        
        while(executando){
            
            ConsoleUI.limparTela();
            ConsoleUI.printTitulo("🗂️ Gerenciador de Tarefas");
            
                
            System.out.println("1. ➕ Adicionar tarefa");
            System.out.println("2. 📋 Listar tarefas");
            System.out.println("3. ✅ Marcar como concluída");
            System.out.println("4. 🗑️ Remover tarefa");
            System.out.println("5. 🚪 Sair");

            
            ConsoleUI.pularLinha(1);
            ConsoleUI.printLinha();
            
            int opcao = scanner.nextInt();
            
            switch (opcao){
                case 1:
                    ConsoleUI.limparTela();
                    ConsoleUI.printTitulo("➕ Adicionar nova tarefa");

                    scanner.nextLine();
                    System.out.println("Descricao da Tarefa");
                    String descricao = scanner.nextLine();
    
                    System.out.println("Escolha a prioridade: ");
                    System.out.println("1- Alta");
                    System.out.println("2- Média");
                    System.out.println("3- Baixa");
                    System.out.println("Opção: ");
                    int opPrioridade = scanner.nextInt();
                    scanner.nextLine();
                    
                    Prioridade prioridade = switch(opPrioridade){
                        case 1 ->Prioridade.ALTA;
                        case 2 ->Prioridade.MEDIA;
                        case 3 ->Prioridade.BAIXA;
                        default ->{
                            System.out.println("⚠️ Prioridade inválida. Definindo como Média.");
                            yield Prioridade.MEDIA;
                            
                        }
                    };
                    manager.adicionarTarefa(descricao, prioridade);
                    
                    ConsoleUI.pularLinha(2);
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    
                    break;
                
                case 2:
                    ConsoleUI.limparTela();
                    ConsoleUI.printTitulo("📋 Lista de Tarefas");
                
                    manager.listarTarefas();
                    ConsoleUI.pularLinha(2);
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    break;
                
                case 3: 
                    ConsoleUI.limparTela();
                    ConsoleUI.printTitulo("✅ Marcar tarefa como concluída");
                
                    System.out.println("Digite o ID da tarefa concluida");
                    int idConcluir = scanner.nextInt();
                    scanner.nextLine();
                    boolean marcou = manager.concluirTarefa(idConcluir);
                    
                    if(marcou){
                        System.out.println("Tarefa concluida com sucesso");    
                    }else{
                        System.out.println("Tarefa nao encontrada");
                        
                    }
                    ConsoleUI.pularLinha(2);
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    break;
                    
                    case 4:
                    
                        ConsoleUI.limparTela();
                        ConsoleUI.printTitulo("🗑️ Remover Tarefa");
                       
                    System.out.println("Id da tarefa a ser removida");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine();
                    boolean removeu = manager.removerTarefa(idRemover);
                    
                    if(removeu){
                        System.out.println("🗑️ Tarefa removida com sucesso.");
                    }
                    else{
                        System.out.println("❌ Tarefa não encontrada.");
                    }
                    ConsoleUI.pularLinha(2);
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    break;
                    
                    case 5:
                    executando = false;
                    ConsoleUI.limparTela();
                    System.out.println("🚪 Encerrando...");
                    System.out.println("👋 Obrigado por usar o Gerenciador de Tarefas.");
                    ConsoleUI.pularLinha(2);
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    break;
                
                    default:
                    
                    ConsoleUI.limparTela();
                    ConsoleUI.printTitulo("❌ Opção inválida");

                    System.out.println("Opção inválida");
                    ConsoleUI.pularLinha(2);
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    break;
            }
        }
        scanner.close();
    }
    
}