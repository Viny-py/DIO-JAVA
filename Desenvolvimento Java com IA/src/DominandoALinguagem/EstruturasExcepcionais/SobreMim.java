package DominandoALinguagem.EstruturasExcepcionais;

import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        try {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura eh " + altura + "m");
        scanner.close();
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Idade precisa ser um numero (ex: 18) e altura um decimal (ex: 1.72) ");
        }
    }
}

