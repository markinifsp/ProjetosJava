/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author ifsp
 */
public class Teste {
    public static void main(String[] args) {
            Funcionario f1 = new Funcionario();
            f1.setCargo("Gerente");
            f1.setNome("Henrique");
            f1.setSalario(5000);
            Funcionario f2 = new Funcionario();
            f2.setCargo("Peão");
            f2.setNome("Marcos");
            f2.setSalario(1500);
            
            Departamento d1 = new Departamento(01, "Administrativo");
            Departamento d2 = new Departamento(02, "Produção");
            
            d1.AdicionarFuncionario(f1);
            d2.AdicionarFuncionario(f2);
            
        System.out.println("Departamento: " + d1.getDescricao());
        System.out.println("Média Salarial: " + d1.calcularMediaSalarial());
    }

}
