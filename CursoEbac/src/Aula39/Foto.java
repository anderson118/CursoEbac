package Aula39;

public class Foto {
    private String foto;
    private int quantidade;

    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void novaFoto(){
        System.out.println("Você tirou uma nova foto!!");
        this.setQuantidade(this.getQuantidade() +1);;
    }
    

}
