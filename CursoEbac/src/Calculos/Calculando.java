public class Calculando {

    private int nota1;
    private int nota2;

    public Calculando(int nota1, int nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public int getNota1() {
        return nota1;
    }
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }
    public int getNota2() {
        return nota2;
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public double soma(){
        return nota1 + nota2;
    }

}
