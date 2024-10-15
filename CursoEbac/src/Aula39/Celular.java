package Aula39;

public class Celular {
    public static void main(String[] args) {
        
        Agenda agenda[] = new Agenda[2];

        agenda[0] = new Agenda(995463438, "Anderson");
        agenda[1] = new Agenda(123345, "Badzinn");

        @SuppressWarnings("unused")
        Ligacao lig = new Ligacao(agenda[0].getNumero(), agenda[0].getNome());


        
       System.out.println(lig.ligar());

        
    }

}
