package OrientacaoObjetosEManipulacaoDados.CelularLAB.APPS.IPOD;

public class ReprodutorMusical implements IPOD {


    public void tocar() {
       System.out.println("Tocando musica");
    }


    public void pausar() {
        System.out.println("Pausando a musica");

    }


    public void selecionarMusica(String musica ) {
        System.out.println("Tocando '"+ musica+ "' pelo IPOD");

    }
    
}
