package DominandoALinguagem.Sintaxe;

public class MinhaClasse {
    public static void main(String[] args) {
        String firstName = "Viny";
        String lastName = "Fonseca Oliveira";

        String fullName = nomeCompleto(firstName, lastName);

        System.out.println(fullName);
    }

    public static String nomeCompleto (String firstName, String lastName) {
        return "Meu nome: ".concat(firstName).concat(" ").concat(lastName);
    }
    
}
