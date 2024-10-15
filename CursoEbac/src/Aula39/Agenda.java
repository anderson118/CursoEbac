package Aula39;

public class Agenda {

    private int numero;
    private String nome;

    public Agenda(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarNumero(int num, String nome){

        this.setNome(nome);
        this.setNumero(num);

    }
    

}
