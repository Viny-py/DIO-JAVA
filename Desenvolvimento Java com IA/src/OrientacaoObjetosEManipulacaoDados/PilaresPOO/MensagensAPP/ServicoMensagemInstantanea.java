package OrientacaoObjetosEManipulacaoDados.PilaresPOO.MensagensAPP;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    
    protected void validarConectadoInternet(){
        System.out.println("Conectado a internet");
    }
}
