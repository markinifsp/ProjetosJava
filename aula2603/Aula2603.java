/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2603;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ifsp
 */
public class Aula2603 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {/**
        
        ContaCorrente cc1 = new ContaCorrente("000-1", "777");
        
        System.out.println("O saldo da conta cc1 é: R$"+cc1.getSaldo());
        
        cc1.depositar(600);
        cc1.sacar(125);
        System.out.println("O saldo da conta cc1 é: R$"+cc1.getSaldo());
        
        ContaCorrente cc2 = new ContaCorrente("000-3", "222");
        cc2.depositar(4000);
        cc2.sacar(1200);
        cc2.depositar(1000);
        System.out.println("O saldo da conta cc2 é: R$"+cc2.getSaldo());
          
        
        
        contaPoupanca cp1 = new contaPoupanca("000-02", "111");
        cp1.depositar(900);
        cp1.rendimento();
        System.out.println("Saldo da conta cp1 R$"+cp1.getSaldo());
        
        contaPoupanca cp2 = new contaPoupanca("000-12", "333");
        cp2.depositar(100);
        cp2.rendimento();
        cp2.depositar(40);
        System.out.println("Saldo da conta cp2 R$"+cp2.getSaldo());
        
        List<Conta> listaConta = new ArrayList();
        listaConta.add(cp2);
        listaConta.add(cp1);
        listaConta.add(cc1);
        listaConta.add(cc2);
        
        Relatorio.contas(listaConta);*/
        
        List<Animal> animais = new ArrayList();
        animais.add(new Cachorro("Toby"));
        animais.add(new Gato("Chavin"));
        animais.add(new Cachorro("Toba"));
        
        for(Animal a : animais){
            System.out.println(a.getNome()+" Fez "+ a.falar());}
                
    }
    
}
