/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2603;

import java.util.List;

/**
 *
 * @author ifsp
 */
public class Relatorio {
    
    public static void contas(List<Conta> listaConta){
        for (Conta a : listaConta){
            System.out.println("==============================");
            System.out.println("Agencia:"+a.getAgencia());
            System.out.println("Numero:"+a.getNumero());
            System.out.println("Saldo:R$"+a.getSaldo());
            System.out.println("==============================");
        }
    }
    
}
