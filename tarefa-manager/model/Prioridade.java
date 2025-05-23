package model;

/*  Enum que representa os niveis de prioridade de uma tarefa*/

public enum Prioridade {
    ALTA,
    MEDIA,
    BAIXA;
    
    
    @Override
    
    public String toString(){
        return switch(this){
            case ALTA  -> "Alta";
            case MEDIA -> "Média";
            case BAIXA -> "Baixa";
            
        }
    }
    
}

