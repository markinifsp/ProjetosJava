/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2603;

/**
 *
 * @author ifsp
 */
public class contaPoupanca extends Conta{
    
    public contaPoupanca(String agencia, String numero) {
        super(agencia, numero);
    }
    
    public void rendimento(){
        //0.5 de rendimento
        double rendimentos = getSaldo()*0.5/100;
        depositar(rendimentos);
}
}
