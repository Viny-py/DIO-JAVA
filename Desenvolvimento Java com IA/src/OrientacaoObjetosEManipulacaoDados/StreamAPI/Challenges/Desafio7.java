package OrientacaoObjetosEManipulacaoDados.StreamAPI.Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio7 {
    //Desafio 7 - Encontrar o segundo número maior da lista:
    //Com a ajuda da Stream API, 
    //encontre o segundo número maior da lista e 
    //exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaOrganizada = numeros.stream()
            .sorted(Integer::compareTo)
            .distinct()
            .collect(Collectors.toList());
            
        int segundoMaior = listaOrganizada.get((listaOrganizada.size()-2));

        System.out.println("Segundo maior numero da lista: " + segundoMaior);

        
    }
}
