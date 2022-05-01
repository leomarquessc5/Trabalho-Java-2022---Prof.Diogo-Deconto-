package models;

public class Login {

    // private String nomeUsuario;
    // private String email;
    private String usuario;
    // private String senha;


    // public String getNomeUsuario() {
    //     return nomeUsuario;
    // }
    // public void setNomeUsuario(String nomeUsuario) {
    //     this.nomeUsuario = nomeUsuario;
    // }
    // public String getEmail() {
    //     return email;
    // }
    // public void setEmail(String email) {
    //     this.email = email;
    // }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    // public String getSenha() {
    //     return senha;
    // }
    // public void setSenha(String senha) {
    //     this.senha = senha;
    // }

    @Override
    public String toString() {
        return 
            // "Nome: " + nomeUsuario + " | E-mail: " + email + " | Usuário: " + usuario + " | Senha: " + senha;
            " || Usuário: " + usuario + "||";
    }

}
