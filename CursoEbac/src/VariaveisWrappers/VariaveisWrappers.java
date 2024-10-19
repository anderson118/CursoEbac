public class VariaveisWrappers {
    public static void main(String[] args) {
        
        //Testando Variaveis e Wrappers conversão de variavel primitiva para wrappers
        long num = 12345678900L;
        System.out.println("Long normal: "+num);
        int idade = 19;
        System.out.println("Int normal: "+ idade);

        //Convertendo com Wrappers 
        // Dividindo 'num' por um divisor, ex: 2
        long result = Long.divideUnsigned(num,2);
        System.out.println("O resultado é: " + result);

        //Se idade == 10, result = 0; Se idade < 10, result = -1(um numero negativo); E se idade > 10, result = 1(um numero positivo)
        int result1 = Integer.compare(idade, 10);
        System.out.println("A conversao int é: " + result1);

        //Obs: Tem outros diversos metodos de conversão 
    }

}
