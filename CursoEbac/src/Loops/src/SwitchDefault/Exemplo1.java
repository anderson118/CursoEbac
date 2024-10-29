package Loops.src.SwitchDefault;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome de um pet: ");
        String pet = sc.nextLine();
        String animal = exemploSwitch(pet);
        System.out.println(animal);

        sc.close();
    }

    public static String exemploSwitch(String animal){
        String result;

        switch (animal) {
            case "Cat":
               result = "Miauu! Um gatinhooo!";
               break;

            case "Dog":
                result = "Auauau! Um doguinhoo!";
                break;
            
            default:
                result = "Animal desconhecido";
                break;
        }
                return result;
    }

}
