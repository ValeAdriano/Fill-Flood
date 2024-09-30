public class Pessoa {
    private String nome;
    private String email;
    private String cpf;/*CONSTRUTOR*/

    public Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    /*GETTERS E SETTERS*/
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /*MÉTODOS*/
    public String pagar(String tipoAss, String nome) {
        return "Você escolheu o plano" + tipoAss + ". Bem-Vindo, " + nome + "!";
    }
}