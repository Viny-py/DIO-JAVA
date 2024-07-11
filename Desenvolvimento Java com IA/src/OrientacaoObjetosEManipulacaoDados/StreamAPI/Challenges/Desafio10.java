package OrientacaoObjetosEManipulacaoDados.StreamAPI.Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio10 {
    //Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
    //Utilize a Stream API para 
    //agrupar os valores ímpares múltiplos de 3 ou de 5 e 
    //exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 15, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> imparMultiplo3 = numeros.stream()
            .filter(n -> n %3 == 0 && n %2 != 0 )
            .sorted(Integer::compareTo)
            .distinct()
            .collect(Collectors.toList());
        
            List<Integer> imparMultiplo5 = numeros.stream()
            .filter(n -> n %5 == 0 && n %2 != 0 )
            .sorted(Integer::compareTo)
            .distinct()
            .collect(Collectors.toList());

            List<Integer> imparMultiplo3e5 = numeros.stream()
            .filter(n -> n %5 == 0 && n %2 != 0 && n %3 == 0)
            .sorted(Integer::compareTo)
            .distinct()
            .collect(Collectors.toList());

        System.out.println("Numeros impares multiplos de 3: " + imparMultiplo3);
        System.out.println("Numeros impares multiplos de 5: " + imparMultiplo5);
        System.out.println("Numeros impares multiplos de 3 e 5: " + imparMultiplo3e5);
    }
}
