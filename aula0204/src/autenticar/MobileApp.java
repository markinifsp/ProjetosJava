/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticar;

/**
 *
 * @author ifsp
 */
public class MobileApp implements Autenticavel{
    private String token;

    public MobileApp(String toke) {
        this.token= toke;
    }
    
    public String getTipo(){
        return "Mobile App";
    }
    public boolean autenticar(){
        return this.token.equals("QWE123");
    }
}
