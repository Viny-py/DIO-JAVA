package OrientacaoObjetosEManipulacaoDados.FundamentosPOO;

public class SistemaIBGE {
    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla().concat(" = ").concat(e.getNome()));
        }

        EstadoBrasileiro casa = EstadoBrasileiro.RIO_JANEIRO;
        System.out.println("Meu estado: ".concat(casa.getNome()).concat("\n") +
        "Sigla do estado: ".concat(casa.getSigla()).concat("\n") + 
        "Numero IBGE: " + casa.getIbge() + "\n" +
        "aa: " + casa.name()
        );
    }
}
