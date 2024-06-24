package DominandoALinguagem.EstruturasCondicionais;
import java.util.Locale;
import java.util.Scanner;


public class CaixaEletronico {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        double saldo = 100;
        System.out.println("Deseja sacar quanto?");
        double valorSolicitado = input.nextDouble();
        
        if (valorSolicitado <= 0) {
                    System.out.println("Numero Invalido");
        }
        else if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Voce sacou com sucesso $" + valorSolicitado + "\nAinde lhe resta $" + saldo + " em sua conta");
        }
        
        else {
            System.out.println("Voce nn tem o bastante para sacar!");
        }

    }
}
