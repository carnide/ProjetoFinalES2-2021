public class TermoResponsabilidade {
    private String Editora;
    private boolean Assinado;

    public TermoResponsabilidade(String editora, boolean assinado) {
        Editora = editora;
        Assinado = assinado;
    }

    public String getEditora() {
        return Editora;
    }

    public boolean getAssinado() {
        return Assinado;
    }

    public void setAssinado(boolean assinado) {
        Assinado = assinado;
    }
}
