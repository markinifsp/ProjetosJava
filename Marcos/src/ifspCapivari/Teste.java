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
public class Teste {
    
    public static void main(String[] args) {
        
        Alunos a1 = new Alunos();
        a1.setNome("Marcos");
        a1.setProntuario("cv308115x");
        
        Alunos a2 = new Alunos();
        a2.setNome("Henrique");
        a2.setProntuario("cv308115x");      
        
        provas p1 = new provas();
        p1.setCodigo(1);
        p1.setData("28/01/2006");
        p1.setDisciplina("Estrutura de dados");
        p1.setMedia(7);
        
        provas p2 = new provas();
        p2.setCodigo(2);
        p2.setData("19/01/2006");
        p2.setDisciplina("Sistemas Operacionais");
        p2.setMedia(5);

        provaAluno pA1= new provaAluno();
        pA1.setAlunos(a1);
        pA1.setNota(4);
        
        provaAluno pA2 = new provaAluno();
        pA2.setAlunos(a2);
        pA2.setNota(8);
        
        List<provaAluno> alunosEstruturaDeDados = new ArrayList();
        alunosEstruturaDeDados.add(pA1);
        alunosEstruturaDeDados.add(pA2);
        p1.setProvaAluno(alunosEstruturaDeDados);
        
        p1.imprimirResultados();
        
        provaAluno p2Marcos = new provaAluno();
        p2Marcos.setAlunos(a1);
        p2Marcos.setNota(6);
        
        provaAluno p2Henrique = new provaAluno();
        p2Henrique.setAlunos(a2);
        p2Henrique.setNota(8);
        
        List<provaAluno> alunosSoperacionais = new ArrayList();
        alunosSoperacionais.add(p2Marcos);
        alunosSoperacionais.add(p2Henrique);
        p2.setProvaAluno(alunosSoperacionais);
        
        p2.imprimirResultados();
    }
    
}
