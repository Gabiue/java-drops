package service; 

import model.Task;
import java.util.ArrayList;
import java.util.List;
import model.Prioridade;

public class TaskManager {
    
    private List <Task> tarefas;
    private int proximoId;
    
    public TaskManager(){
        this.tarefas = new ArrayList<>();
        this.proximoId = 1;
    }
    public void adicionarTarefa(String descricao, Prioridade prioridade){
        Task nova = new Task(proximoId++, descricao, prioridade);
        tarefas.add(nova);
        System.out.println("Tarefa adicionada com sucesso!");
    }
    public void listarTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("nenhum registro encontrado");
        } else {
            System.out.println("Lista de tarefas");
            for (Task t : tarefas){
                System.out.println(t);
            }
        }
    }
    public boolean concluirTarefa(int id){
        for (Task t : tarefas){
            if (t.getId()==id){
                t.setConcluida(true);
                return true;
            }
        }
        return false;
    }
    public boolean removerTarefa(int id){
        return tarefas.removeIf(t -> t.getId()==id);
    }
    public boolean isVazio(){
        return tarefas.isEmpty();
    }
}
