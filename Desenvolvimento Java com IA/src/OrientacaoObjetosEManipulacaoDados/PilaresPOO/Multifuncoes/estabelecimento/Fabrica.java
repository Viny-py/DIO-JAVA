package OrientacaoObjetosEManipulacaoDados.PilaresPOO.Multifuncoes.estabelecimento;

import OrientacaoObjetosEManipulacaoDados.PilaresPOO.Multifuncoes.Equipamentos.Copiadora.Copiadora;
import OrientacaoObjetosEManipulacaoDados.PilaresPOO.Multifuncoes.Equipamentos.Digitalizadora.Digitalizadora;
import OrientacaoObjetosEManipulacaoDados.PilaresPOO.Multifuncoes.Equipamentos.Impressora.Deskjet;
import OrientacaoObjetosEManipulacaoDados.PilaresPOO.Multifuncoes.Equipamentos.Impressora.Impressora;
import OrientacaoObjetosEManipulacaoDados.PilaresPOO.Multifuncoes.Equipamentos.Impressora.Laserjet;
import OrientacaoObjetosEManipulacaoDados.PilaresPOO.Multifuncoes.Equipamentos.Multifuncional.EquipamentoMultifuncional;

@SuppressWarnings("unused")
public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;

        copiadora.copiar();
        digitalizadora.Digitalizar();

    }
}
