package DominandoALinguagem.EstruturasCondicionais;
import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual eh o tamanho?");
        String sigla = input.next();

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Medio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Tamanho Indefinido");
                break;
        }
    }
}
