package DominandoALinguagem.EstruturasRepeticao;
import java.util.*;

public class Carneirinhos {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Quantos carneirinhos ate cair no sono?");
        int carneirinhosQuantia = input.nextInt();

        for (int carneirinhos = 1 ; carneirinhos <= carneirinhosQuantia; carneirinhos++){
            System.out.println(carneirinhos);
        }
        System.out.println("Mimiu");
    }
}
