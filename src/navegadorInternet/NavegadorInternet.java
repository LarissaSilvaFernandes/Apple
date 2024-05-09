package navegadorInternet;

public class NavegadorInternet implements FerramentaNavegadorInternet{
    @Override
    public String exibirPagina() {
        return "exibindo página...";
    }

    @Override
    public String adicionarNovaAba() {
        return "adicionando nova aba...";
    }

    @Override
    public String atualizarPagina() {
        return "atualizando página...";
    }
}
