package DominandoALinguagem.EstruturasRepeticao;
import java.util.Random;


public class Ligacao {
    
    public static void main(String[] args) {
        System.out.println("Discando...");
        
        do {
            System.out.println("Telefone tocando");
        }
        while (tocando()); {
            System.out.println("Aloo!!");
        }

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println(atendeu);
        return ! atendeu;
    }
}
 
