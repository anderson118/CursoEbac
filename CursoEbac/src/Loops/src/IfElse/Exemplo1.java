package Loops.src.IfElse;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

    
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            String id = getIdade(idade);
            System.out.println(id);
        }

    }
   
    public static String getIdade(int idade){
        if (idade > 1 && idade < 10) {
            return"Ainda é uma criança!";
        }else if (idade < 18) {
            return"Ja é um adolecente!";
        }else{
            return"Já é um adulto!";
        }
    }

}
