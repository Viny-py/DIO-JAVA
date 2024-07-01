package OrientacaoObjetosEManipulacaoDados.PilaresPOO.Multifuncoes.Equipamentos.Multifuncional;

import OrientacaoObjetosEManipulacaoDados.PilaresPOO.Multifuncoes.Equipamentos.Copiadora.Copiadora;
import OrientacaoObjetosEManipulacaoDados.PilaresPOO.Multifuncoes.Equipamentos.Digitalizadora.Digitalizadora;
import OrientacaoObjetosEManipulacaoDados.PilaresPOO.Multifuncoes.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }

    @Override
    public void Digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }
    
}
