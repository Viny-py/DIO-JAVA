package OrientacaoObjetosEManipulacaoDados.StreamAPI.Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio14 {
    //Desafio 14 - Encontre o maior número primo da lista:
    //Com a Stream API, 
    //encontre o maior número primo da lista e exiba o resultado no console.

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> numerosPrimos = numeros.stream()
        .sorted(Integer::compareTo)
        .distinct()
        .filter(n -> {
            if (n <= 1) {
                return false;
            }
            // Faz um loop de 2 até a raiz quadrada do número
            for (int i = 2; i * i <= n; i++) {
                // Se o número for divisível por algum valor no intervalo, não é primo
                if (n % i == 0) {
                    return false;
                }
            }
            // Se não foi encontrado divisor no loop, o número é primo
            return true;
        })
        .collect(Collectors.toList());

        System.out.println("Maior numero primo da lista: " + (numerosPrimos.get(numerosPrimos.size() - 1)));
    }
}
