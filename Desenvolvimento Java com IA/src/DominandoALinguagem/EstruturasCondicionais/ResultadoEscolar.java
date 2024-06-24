package DominandoALinguagem.EstruturasCondicionais;
import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual foi sua nota?");
        int nota = input.nextInt();

        if (nota < 0) {
            System.out.println("Nota invalida");
        }
        else if (nota > 10) {
            System.out.println("Nota invalida");
        }
        else if (nota >= 5 && nota < 7) {
            System.out.println("Entao... O requisito para passar era 7 e voce tirou " + nota + "\nVoce esta de recuperacao!");
        }
        else if (nota < 5) {
            System.out.println("Puts! O requisito para passar era 5 e voce tirou " + nota + "\nVoce nao passou!");
        }
        else if (nota >= 7) {
            System.out.println("Parabens! O requisito para passar era 7 e voce tirou " + nota + "\nVoce passou!");
        }
    }
}
