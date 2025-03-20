/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifspCapivari;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ifsp
 */
public class Alunos {
    
    private String prontuario;
    private String nome;
    private List<provaAluno> provasFeitas;
    
    
    public Alunos(){
        this.provasFeitas = new ArrayList();
    }
    public String getProntuario() {
        
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<provaAluno> getProvasFeitas() {
        return provasFeitas;
    }

    public void setProvasFeitas(List<provaAluno> provasFeitas) {
        this.provasFeitas = provasFeitas;
    }
    
    
}
