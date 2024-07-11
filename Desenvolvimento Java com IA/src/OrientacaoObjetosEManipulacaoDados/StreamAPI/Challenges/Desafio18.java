package OrientacaoObjetosEManipulacaoDados.StreamAPI.Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio18 {
    //Desafio 18 - Verifique se todos os números da lista são iguais:
    //Utilizando a Stream API, 
    //verifique se todos os números da lista são iguais e 
    //exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Agrupa os números com base no próprio número.
        Map<Integer, List<Integer>> grupos = numeros.stream()
            .collect(Collectors.groupingBy(num -> num));

        // números que se repetem {chave - valor.}
        System.out.println(grupos); 
        
        // Filtra os grupos com tamanho do valor maior que 1, logo, os números repetidos.
        List<Integer> numerosRepetidos = grupos.entrySet().stream()
            .filter(entry -> entry.getValue().size() > 1) // Filtamos as chaves pelos valores contendo acima de 1 repetição
            .map(entry -> entry.getKey()) // Pegamos apenas as chaves
            .collect(Collectors.toList()); // Coletamos para uma nova lista

        // Imprime os números repetidos.
        System.out.println(numerosRepetidos);
    }
}
