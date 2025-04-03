/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autenticar;

/**
 *
 * @author ifsp
 */
public class AutenticarService {
    //receber um objeto "autenticavel" e validar sua atenticação
    
    public static void validarAutenticacao(Autenticavel a){
        if (a.autenticar()){
            System.out.println(a.getTipo()+" Autenticado com sucesso!!");
        }
        else{
            System.out.println("Erro ao autenticar "+a.getTipo());
        }
        
    }
}
