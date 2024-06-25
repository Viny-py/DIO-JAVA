package DominandoALinguagem.EstruturasRepeticao;
import java.util.concurrent.*;


public class Doces {
    
    public static void main(String[] args) {
        
        double mesada = 50;

        while (mesada > 0) {
            double valorDoce = Math.round(valorAleatorio() * 100.0) / 100.0;
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Valor do doce: " + valorDoce);
            mesada = Math.round((mesada - valorDoce) * 100.0) / 100.0;
            System.out.println("Valor da mesada restante: " + mesada);
        }
        System.out.println("Seu dinheiro acabou");

    }


    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1, 15);
    }
}
