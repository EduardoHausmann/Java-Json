package programajson;

public class Funcionario {
    private String Usuario;
    private String Senha;
    private String Cargo;
    private Double Salario;
    private String Contato;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    public String getContato() {
        return Contato;
    }

    public void setContato(String Contato) {
        this.Contato = Contato;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "Usuario=" + Usuario + ", Senha=" + Senha + ", Cargo=" + Cargo + ", Salario=" + Salario + ", Contato=" + Contato + '}';
    }       
}