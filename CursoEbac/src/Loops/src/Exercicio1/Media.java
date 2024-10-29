package Loops.src.Exercicio1;

public class Media {

    private String aluno;
    private float nota1;
    private float nota2;

    public Media(String aluno, float nota1, float nota2) {
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public String mediaAlunos(){
        float media;
        String txt;
        media = ((this.getNota1() + this.getNota2())/2);

        if (media >= 7) {
           txt = ("Aluno " + this.getAluno() + " aprovado!!");
        } else {
            txt = ("Aluno " + this.getAluno() + "  reprovado!!");
        }
        return txt;
    }

}
