package DominandoALinguagem.Sintaxe;

public class Operadores {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        int idade = 19;
        double peso = 70.8;
        char sexo = 'M';
        boolean DoadorOrgao = false;
        
        double soma = 15.7 + 13.2;
        int subtracao = 233 - 33;
        int multiplicacao = 10 * 8;
        int divisao = 25 / 5;
        int modulo = 18 % 3;

        int a = 2;
        int b = 2;

        System.out.println(iguais(a, b));
        System.out.println(igual(a, b));
        System.out.println(equal(a, b));

        //Vendo se as variaveis "a" e "b" sao iguais
        // Return a value if they are equal!
        System.out.println(valor6(a, b));

    }

    public static boolean iguais (int a, int b) {
        return a == b;
    }

    public static String igual (int a, int b) {
        return a + 1 == b? "Verdadeiro" : "Falso";
    }

    public static int equal (int a, int b) {
        return a == b? 1 : 0;
    }

    public static String valor6 (int a, int b) {
        //vemos se uma das variaveis, as duas, ou se nenhuma variavel tem o valor de numero 6
        if ((a == 6) && (b == 6)) {
            return "As duas variaveis tem o valor de 6";
        }
        else if ((a == 6) || (b ==6)) {
            return "Uma variavel tem o valor de 6";
        }
        else {
            return "Nenhuma das duas variaveis tem o valor de 6";
        }
    }
}
