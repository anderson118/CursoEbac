package Aula39;

public class Mensagem extends Agenda{

    public Mensagem(int numero, String nome) {
        super(numero, nome);
        //TODO Auto-generated constructor stub
    }

    private String msg;
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String enviarMsg(){
        return"Nova mensagem sendo enviada para pessoa: " + this.getNome() + "\nCom numero: " + this.getNumero() +"\nMesagem: " +this.getMsg();
    }
    
}
