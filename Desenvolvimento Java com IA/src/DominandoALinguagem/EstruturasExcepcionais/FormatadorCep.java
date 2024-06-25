package DominandoALinguagem.EstruturasExcepcionais;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376064");
        } catch (CepInvalidoException e) {
            System.out.println("O cep nao corresponde com as regras");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) 

            throw new CepInvalidoException();
            return "23.765-064";

    }
}
