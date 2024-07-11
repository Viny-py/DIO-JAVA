package OrientacaoObjetosEManipulacaoDados.StreamAPI.Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio15 {
    //Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
    //Utilizando a Stream API, 
    //verifique se a lista contém pelo menos um número negativo e 
    //exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNegativos = numeros.stream()
            .filter(n -> n < 0)
            .collect(Collectors.toList());
            
            System.out.println("Numeors negativos da lista: " + numerosNegativos);
    }
}
