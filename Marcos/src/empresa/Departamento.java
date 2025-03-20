/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ifsp
 */
public class Departamento {
    private int codigo;
    private String descricao;    
    private List<Funcionario> funcionarios;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void AdicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public Departamento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.funcionarios = new ArrayList<>();
    }
    
    public double calcularMediaSalarial() {
        if (funcionarios.isEmpty()) {
            return 0.0;
        }
        double soma = 0.0;
        for (Funcionario funcionario : funcionarios) {
            soma += funcionario.getSalario();
        }
        return soma / funcionarios.size();
    }
    }

