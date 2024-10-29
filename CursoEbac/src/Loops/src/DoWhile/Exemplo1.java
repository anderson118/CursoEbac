package Loops.src.DoWhile;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String resposta = "";
;            do{
                System.out.println("Qual tabuada deseja gerar? ");
                int num = sc.nextInt();

                for(int i  = 0; i <= 10; i++){
                    System.out.println(num + " X " +i + " = " + (num*i));
                }
            
                System.out.println("Deseja gerar outra tabuada? ");
                resposta = sc.next();

            }while (resposta.equalsIgnoreCase("Sim"));

        

        System.out.println("Muito Obrigado!");
        
        sc.close();
    }
}
