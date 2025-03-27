/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2603;

/**
 *
 * @author ifsp
 */
public abstract class Conta {
    
    private String agencia;
    private String numero;
    private double saldo;

    public Conta(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        this.saldo -=valor;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    
}
