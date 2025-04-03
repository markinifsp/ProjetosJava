/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0204;

import autenticar.AutenticarService;
import autenticar.MobileApp;
import autenticar.Superadmin;
import autenticar.Usuario;

/**
 *
 * @author ifsp
 */
public class Aula0204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u1 = new Usuario("IFSP", "122");
        
        AutenticarService.validarAutenticacao(u1);
        
        System.out.println("========================");
        
        Superadmin sa1 = new Superadmin("teste@gmail.com","13245");
        AutenticarService.validarAutenticacao(sa1);
        
        System.out.println("===================");
        
        MobileApp ma1 = new MobileApp("QWE123");
        
        AutenticarService.validarAutenticacao(new MobileApp("QWE123"));
        
        System.out.println("=====================");
    }
    
}
