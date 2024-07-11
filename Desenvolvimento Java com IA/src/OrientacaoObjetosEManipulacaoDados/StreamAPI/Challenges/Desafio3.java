package OrientacaoObjetosEManipulacaoDados.StreamAPI.Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio3 {
    //Desafio 3 - Verifique se todos os números da lista são positivos:
    //Com a ajuda da Stream API, 
    //verifique se todos os números da lista são positivos e 
    //exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-5, 0, 1, 2, 3, 4, 5, 6, -4, 7, 8, 9, 10, 5, 4, 3, -1);

        List<Integer> positivos = numeros.stream().filter(n -> n > 0).collect(Collectors.toList());

        System.out.println("Numeros positivos: "+ positivos);
    }

    

}
