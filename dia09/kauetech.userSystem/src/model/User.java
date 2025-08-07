package model;

import java.util.Objects;

public class User {
    
    private String name;
    private String email;
    private int age;

    public User(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // Criar getters

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    // Criar Setters

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Nome: "+name+", Email: "+email+", Idade: "+age;
    }

    @Override 
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(!(obj instanceof User))return false;
        User other = (User) obj;
        return email.equalsIgnoreCase(other.email);
    }

    @Override
    public int hashCode(){
        return Objects.hash(email.toLowerCase());
    }
}
