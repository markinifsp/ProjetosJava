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
public class provas {
    
    private int codigo;
    private String disciplina;
    private String data;
    private int media;
    private List <provaAluno> provaAluno;

    public List<provaAluno> getProvaAluno() {
        return provaAluno;
    }

    public void setProvaAluno(List<provaAluno> provaAluno) {
        this.provaAluno = provaAluno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

 
    public provas(){
        this.provaAluno = new ArrayList();
    }
       
    public void imprimirResultados(){
        for(provaAluno provaAluno : this.getProvaAluno()){
            if(provaAluno.getNota() > this.media){
                System.out.println("Nome: "+ provaAluno.getAlunos().getNome()+"\n" +"Nota: \n" + provaAluno.getNota()+"\n"+"Aprovado");}
            
            else{
                System.out.println("Nome: "+ provaAluno.getAlunos().getNome()+"\n" +"Nota: \n" + provaAluno.getNota()+"\n"+"Reprovado");
            }
        }
        
    }
    
}
