package Aula39;

public class Ligacao extends Agenda {

    public Ligacao(int numero, String nome) {
        super(numero, nome);
        //TODO Auto-generated constructor stub
    }

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String ligar(){
        return text = "Ligando para " + this.getNome() + ", numero:..." +this.getNumero();

    }


}
