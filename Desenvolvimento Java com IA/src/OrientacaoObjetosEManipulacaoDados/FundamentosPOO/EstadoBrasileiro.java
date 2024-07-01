package OrientacaoObjetosEManipulacaoDados.FundamentosPOO;

public enum EstadoBrasileiro {
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 11),
    SAO_PAULO ("SP", "Sao Paulo", 12),
    PIAUI ("PI", "Piaui", 13)
    ;

    private String sigla;
    private String nome;
    private int ibge;

    EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
        
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
    
    
}
