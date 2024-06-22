package DominandoALinguagem.Sintaxe.SmartTV;

public class User {
    
    public static void main(String[] args) throws Exception{

        //OBS: nomes mudados do video para esclarecimento pessoal
        //("nome do .java" "variavel que quiser" = "new" "nome do .java")
        aSmartTv tv = new aSmartTv();

        //use os comandos criados no outro documento ("aSmartTv") para mudar os status!
        //como
        tv.ligar();
        tv.mudarCanal(12);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();

        // print status da TV
        System.out.println("TV Ligada: "+ tv.ligada);
        System.out.println("Canal da TV: " + tv.canal);
        System.out.println("Volume da TV: " + tv.volume);
        
    }

}
