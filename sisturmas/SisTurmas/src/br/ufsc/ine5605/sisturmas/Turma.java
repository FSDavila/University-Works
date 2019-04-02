package br.ufsc.ine5605.sisturmas;

import java.util.ArrayList;

public class Turma {
private String turma;
private ArrayList<Aluno> alunos;

    public Turma(String codigo) {
        this.turma = codigo;
        this.alunos = new ArrayList<>();
    }

    
    public String getTurma() {
        return turma;
    }
    
    public String getCodigo() {
        return this.turma;
    }
    
    public void setCodigo(String codigo) {
        this.turma = codigo;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public void delAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }
    
    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }
    
    
    
}
