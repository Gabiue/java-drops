package model;


public class Task{
    private int id; 
    private String descricao;
    private String prioridade;
    private boolean concluida;
    
    public Task(int id, String descricao, String prioridade ){
        this.id = id;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }
    
    public int getId(){
        return id;
    }
    public String getDescricao(){
        return descricao;
        
    }
    
    public String getPrioridade(){
        return prioridade;
    }
    public boolean isConcluida(){
        return concluida;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
        
    }
    public void setPrioridade(String prioridade){
        this.prioridade = prioridade;
    }
    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }
    
    
    
    public String toString(){
        String status = concluida ? "Concluida" : "Pendente";
       return String .format(
           "[%d] %s (prioridade: %s) - %s", id, descricao, prioridade, status
       ); 
    }
}