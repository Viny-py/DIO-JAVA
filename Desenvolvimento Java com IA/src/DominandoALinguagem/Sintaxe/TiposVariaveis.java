package DominandoALinguagem.Sintaxe;

public class TiposVariaveis {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // byte idade = 123;
        // short ano = 2024;
        // int cep = 21070333;
        // long cpf = 98765432109L; 
        // float pi = 3.14F; 
        // double salario = 1275.33;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //cast 

        //pode mudar de valor:
        int numero = 1;
        numero = 2;

        //Adicionando "final" no comeco de uma "variavel", ela se torna uma constante
        //Constante nn pode mudar de valor, ent se tentarmos mudar de valor, ele da erro!
        final double valorDePI = 3.14;
        //valorDePI = 2.1; (erro)

    }   
}
