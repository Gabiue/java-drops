package service;

import model.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    
    private List<User> userList;

    public UserService (){
        this.userList = new ArrayList<>();
    }

    // Cadastrar o user

    public boolean addUser(String name, String email, int age){
        if(isEmailValid(email) && !emailExists(email)){
            User user = new User(name, email, age);
            userList.add(user);
            return true;
        }
        return false; 
    }

    // Listar todos os Users
    public  List<User> getAllUsers(){
        return userList;
    }
    
    // Buscar por email
    public User findUserByEmail(String email){
        for (User user : userList){
            if (user.getEmail().equalsIgnoreCase(email)){
                return user;
            }
        }
        return null;
    }
    
    //Atualizar idade por email??
    public boolean updateUserAge(String email, int newAge ){
        User user = findUserByEmail(email);
        if (user != null){
            user.setAge(newAge);
            return true;
        }
        return false;
    }

    //Remover usuario por email
    public boolean removeUserByEmail(String email){
        User user = findUserByEmail(email);
        if(user != null){
            userList.remove(user);
            return true;
        }
        return false;
    }
    // Verificação se o email existe
    private boolean emailExists(String email){
        return findUserByEmail(email) != null; 
    }

    //Validação de padrão do email
    private boolean isEmailValid(String email){
        return email != null && email.contains("@") && email.contains(".");
    }


}
