package DominandoALinguagem.EstruturasCondicionais;
import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolarSimples {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual foi sua nota?");
        int nota = input.nextInt();

        String resultado = nota >= 7? "Aprovado" : "Reprovado";

        System.out.println(resultado);
        System.out.println(nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado");
    }
}
