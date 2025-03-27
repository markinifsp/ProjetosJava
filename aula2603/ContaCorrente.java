/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2603;

/**
 *
 * @author ifsp
 */
public class ContaCorrente extends Conta{
    
    private double chequeEspecial;
    
    public ContaCorrente(String agencia, String numero) {
        super(agencia, numero);
        this.chequeEspecial = 0;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    
    
    
    
    
}
