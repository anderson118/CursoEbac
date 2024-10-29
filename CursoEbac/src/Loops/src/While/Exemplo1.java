package Loops.src.While;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Deseja gerar a variavel de algum numero: ");
            String resposta = sc.nextLine();

            while (resposta.equalsIgnoreCase("Sim")) {
                System.out.println("Qual tabuada deseja gerar? ");
                int num = sc.nextInt();

                for(int i  = 0; i <= 10; i++){
                    System.out.println(num + " X " +i + " = " + (num*i));
                }

                System.out.println("Deseja realizar outra tabuada? ");
                resposta = sc.nextLine();
            }
        }

        System.out.println("Muito Obrigado!");
    }

}
