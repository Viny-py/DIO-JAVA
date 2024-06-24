package DominandoALinguagem.EstruturasCondicionais;
import java.util.Locale;
import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual eh o plano?");
        String sigla = input.next();

        switch (sigla) {
            case "B": {
                System.out.println("Plano Basico: 100 minutos de ligacao");
                break;
            }
            case "M": {
                System.out.println("Plano Midia: 100 minutos de ligacao + Whatsapp e Instagram (gratis)");
                break;
            }
            case "T": {
                System.out.println("Plano Turbo: 100 minutos de ligacao + Whatsapp e Instagram (gratis) + 5GB de Youtube");
                break;
            }
            default:
                System.out.println("Plano Inexistente");
                break;
        }
    }
}
