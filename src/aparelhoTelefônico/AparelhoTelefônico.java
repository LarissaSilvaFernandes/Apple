package aparelhoTelefônico;

public class AparelhoTelefônico implements FerramentaAparelhoTelefônico {

    @Override
    public String ligar() {
        return "ligando...";
    }

    @Override
    public String atender() {
        return "atendendo...";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "iniciando correio de voz...";
    }
}
