/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.util.ArrayList;

public class Aluno {
private String matricula;
private ArrayList<Turma> turmas;

    public Aluno(String matricula) {
        this.matricula = matricula;
        this.turmas = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }
    public void delTurma(Turma turma) {
        this.turmas.remove(turma);
    }
    public ArrayList<Turma> getTurmas() {
        return this.turmas;
    }
    
}
