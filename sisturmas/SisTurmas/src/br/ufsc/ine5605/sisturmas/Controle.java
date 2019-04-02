
package br.ufsc.ine5605.sisturmas;
import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    private Scanner teclado;
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;
    
    public Controle(){
        this.teclado = new Scanner(System.in);
        this.turmas = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }
    public void inicia() {
        int opcao;
        do{
        System.out.println("-----------SISTURMAS-----------");
        System.out.println("Opcoes: ");
        System.out.println("1 - Incluir Turmas");
        System.out.println("2 - Incluir Alunos");
        System.out.println("3 - Listar Turmas");
        System.out.println("4 - Listar Alunos");
        System.out.println("0 - Encerrar Sistema");
        System.out.println("-------------------------------");
        
        System.out.println("");
        
        opcao = teclado.nextInt();
        
        switch (opcao){
            case 1:
                incluiTurma();
                break;
            case 2:
                incluiAluno();
                break;
            case 3:
                listaTurmas();
                break;                
            case 4:
                listaAlunos();   
                break;
            case 5:
                matriculaAluno();   
                break;     
        }
        }
        while(opcao != 0);
    }

    private void incluiTurma() {
        System.out.println("------- INSERINDO TURMA -------");
        System.out.println("Codigo: ");
        String codigo = teclado.nextLine();
        Turma turma = new Turma(codigo);
        turmas.add(turma);
    }

    private void incluiAluno() {
        System.out.println("------- INSERINDO ALUNO -------");
        System.out.println("Matricula: ");
        String matricula = teclado.nextLine();
        Aluno aluno = new Aluno(matricula);
        alunos.add(aluno);
    }

    private void listaTurmas() {
        System.out.println("------- LISTANDO TURMAS -------");
        for(Turma turma: turmas){
               System.out.println("Turma: " + turma.getCodigo());
               
        }
    }

    private void listaAlunos() {
        System.out.println("------- LISTANDO ALUNOS -------");
        for(Aluno aluno: alunos){
               System.out.println("Aluno: " + aluno.getMatricula());  
               limpaScanner();
        }
    }
    
    public void limpaScanner(){
        teclado.nextLine();
    }

    
    public Aluno getAlunoByMatricula(String matricula){
        Aluno procurado = null;
        for(Aluno aluno: alunos){
            if(aluno.getMatricula().equals(matricula)){
                procurado = aluno;
            }
        }
        return procurado;
    }
    
    public Turma getTurmaByCodigo(String codigo){
        Turma procurada = null;
        for(Turma turma: turmas){
            if(turma.getCodigo().equals(codigo)){
                procurada = turma;
            }
        }
        return procurada;
    }    

    public void matriculaAluno() {
        System.out.println("------- INSIRA MATRICULA DO ALUNO -------");
        String matricula = teclado.nextLine();
        limpaScanner();
        System.out.println("------- INSIRA TURMA A MATRICULAR -------");
        String turma = teclado.nextLine();
        limpaScanner();
        this.getTurmaByCodigo(turma).addAluno(getAlunoByMatricula(matricula));
        this.getAlunoByMatricula(matricula).addTurma(getTurmaByCodigo(turma));
    }
   
}
