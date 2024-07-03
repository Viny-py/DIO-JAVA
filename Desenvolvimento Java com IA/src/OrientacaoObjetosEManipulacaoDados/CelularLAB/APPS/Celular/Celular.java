package OrientacaoObjetosEManipulacaoDados.CelularLAB.APPS.Celular;

import OrientacaoObjetosEManipulacaoDados.CelularLAB.APPS.IPOD.IPOD;
import OrientacaoObjetosEManipulacaoDados.CelularLAB.APPS.Safari.Safari;
import OrientacaoObjetosEManipulacaoDados.CelularLAB.APPS.Telefone.Telefone;

public class Celular implements IPOD, Safari, Telefone{
    //IPOD
    public void tocar() {
        System.out.println("Tocando musica");
     }
     public void pausar() {
         System.out.println("Pausando a musica");
     }
     public void selecionarMusica(String musica ) {
        System.out.println("Tocando '"+ musica+ "' pelo IPOD");
     }
    
     //SAFARI
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
     }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
     }
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }
    
    //TELEFONE
    public void ligar(String numero) {
        try {
            verificarNumeroTelefone(numero);
            System.out.println("Ligando para " + numero+ "...");
        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public void atender(boolean escolha) {
        if (escolha) {
            System.out.println("Atendendo o telefone");
        }else {
            System.out.println("Recusando chamada");
        }
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
       }

    private void verificarNumeroTelefone(String numero){
        if (numero.length() != 15) {
            throw new IllegalArgumentException("Numero de telefone invalido. Digite exatamente 10 numeros.");
        }
    }
}
