package OrientacaoObjetosEManipulacaoDados.PilaresPOO.MensagensAPP;

public class ComputadorViny {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido= "Facebook";
        
        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("Facebook")) {
            smi = new FacebookMessenger();
        }else if(appEscolhido.equals("Telegram")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

        // MSNMessenger msn = new MSNMessenger();
        // System.out.println("MSN:");
        // msn.enviarMensagem();
        // msn.receberMensagem();
        // System.out.println("-----");

        // FacebookMessenger face = new FacebookMessenger();
        // System.out.println("FACEBOOK:");
        // face.enviarMensagem();
        // face.receberMensagem();
        // System.out.println("-----");

        // Telegram tlg = new Telegram();
        // System.out.println("TELEGRAM:");
        // tlg.enviarMensagem();
        // tlg.receberMensagem();
        // System.out.println("-----");


    }
}
