import aparelhoTelefônico.AparelhoTelefônico;
import navegadorInternet.NavegadorInternet;
import repodutorMusicial.RepodutorMusicial;

public class Main {
    public static void main(String[] args) {
        AparelhoTelefônico aparelhoTelefônico = new AparelhoTelefônico();
        System.out.println(aparelhoTelefônico.ligar());
        System.out.println(aparelhoTelefônico.atender());
        System.out.println(aparelhoTelefônico.iniciarCorreioVoz());
        System.out.println();
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        System.out.println(navegadorInternet.exibirPagina());
        System.out.println(navegadorInternet.adicionarNovaAba());
        System.out.println(navegadorInternet.atualizarPagina());
        System.out.println();
        RepodutorMusicial musicial = new RepodutorMusicial();
        System.out.println(musicial.tocar());
        System.out.println(musicial.pausar());
        System.out.println(musicial.selecionarMusica());
    }
}