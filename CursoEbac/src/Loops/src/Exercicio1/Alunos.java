package Loops.src.Exercicio1;

import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String resposta;
        do {

            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua primeira nota: ");
            float n1 = sc.nextFloat();
            System.out.println("Digite sua segunda nota: ");
            float n2 = sc.nextFloat();

                if (n1 <= 10 && n2 <= 10) {

                    Media md = new Media(nome, n1, n2);
                    System.out.println(md.mediaAlunos());
                }else{
                    System.out.println("Informações incorretas!!\nDigite novamente as informações.");
                    sc.nextLine();
                    resposta = "Sim";
                    continue;
                   
                }
                sc.nextLine();
                System.out.println("Deseja inserir outro aluno? Sim?Não");
                resposta = sc.nextLine();
                
        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Espero ter ajudado!!");

    sc.close();;
    }
}
