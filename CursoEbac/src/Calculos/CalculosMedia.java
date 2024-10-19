public class CalculosMedia {
    public static void main(String[] args) {

        Calculando calc[] = new Calculando[4];

         calc[0] = new Calculando(10, 20);
         calc[1] = new Calculando(25, 15);
         calc[2] = new Calculando(14, 7);
         calc[3] = new Calculando(30, 5);
         

        double media;

        media = ((calc[0].soma() + calc[1].soma() + calc[2].soma() + calc[3].soma())/2);
        System.out.println("A media dos 4 alunos é: " + media);

    }
}
