package OrientacaoObjetosEManipulacaoDados.CelularLAB.iPhone;

import OrientacaoObjetosEManipulacaoDados.CelularLAB.APPS.Celular.Celular;
import OrientacaoObjetosEManipulacaoDados.CelularLAB.APPS.IPOD.IPOD;
import OrientacaoObjetosEManipulacaoDados.CelularLAB.APPS.Safari.Safari;
import OrientacaoObjetosEManipulacaoDados.CelularLAB.APPS.Telefone.Telefone;

public class iPhone {
    public static void main(String[] args) {
        Celular iphone = new Celular();

        // iphone.selecionarMusica("Zachem - 6YNTHMANE, 5sta Family, BAbyBoi");
        // iphone.pausar();
        // iphone.ligar("+1 438 928 6382");
        // iphone.exibirPagina();
        // iphone.atender(false);
        // iphone.tocar();

        IPOD musica = iphone;
        musica.tocar();
        musica.selecionarMusica("Zachem");
        musica.pausar();

        Safari net = iphone;
        net.adicionarNovaAba();
        net.atualizarPagina();
        net.exibirPagina();

        Telefone tel = iphone;
        tel.atender(true);
        tel.atender(false);
        tel.ligar("+1 438 928 6382");
        tel.iniciarCorreioVoz();
    }
}
