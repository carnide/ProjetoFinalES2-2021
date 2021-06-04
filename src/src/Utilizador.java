public class Utilizador {
    String email;
    String password;
    String token;
    boolean estado;

    Utilizador(String _email,String _password){
        this.email = _email;
        this.password = _password;
        TokenGenerator token = new TokenGenerator();
        this.token = token.getToken();
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public String getToken(){
        return this.token;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean _estado){
        this.estado = _estado;
    }
}