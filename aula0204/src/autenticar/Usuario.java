/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticar;

/**
 *
 * @author ifsp
 */
public class Usuario implements Autenticavel{
    private String username;
    private String password;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getTipo (){
        return "Users";
    }
    
    public boolean autenticar(){
        return this.username.equals("IFSP") && this.password.equals("123");
    }
    
}


