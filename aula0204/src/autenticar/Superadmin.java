/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticar;

/**
 *
 * @author ifsp
 */
public class Superadmin implements Autenticavel{
    private String email;
    private String a2f;//Autenticar em 2 fatores

    public Superadmin(String email, String a2f) {
        this.email = email;
        this.a2f = a2f;
    }
    
     public String getTipo (){
        return "SuperAdmin";
    }
    
    public boolean autenticar(){
        return this.email.equals("teste@gmail.com") && this.a2f.equals("12345");
    }
    
}
