package exercicio02;

public class NO {
    
    public NO(Aluno aluno2) {

    }
    
    int RA = 0; 
    String nome = "", turma = "", semestre = "";
    Aluno aluno = new Aluno(RA, nome, turma, semestre);

    public Aluno[] dado;
    public NO proximo;
}