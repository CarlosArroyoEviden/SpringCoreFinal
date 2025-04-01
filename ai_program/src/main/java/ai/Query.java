package ai;

public class Query {
    private String texto;
    private User usuario;

    public Query(String texto, User usuario) {
        this.texto = texto;
        this.usuario = usuario;
    }

    public String getTexto() {
        return texto;
    }

    public User getUsuario() {
        return usuario;
    }
}