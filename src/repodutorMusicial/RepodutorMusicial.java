package repodutorMusicial;


public class RepodutorMusicial implements FerramentaRepodutorMusicial {

    @Override
    public String tocar() {
        return "tocando música...";
    }

    @Override
    public String pausar() {
        return "pausando música...";
    }

    @Override
    public String selecionarMusica() {
        return "selecionando música...";
    }
}
