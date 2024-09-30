public class Funcionario extends Pessoa {
    private int idFunc;
    private String tipoFunc;

    /*CONSTRUTOR*/
    public Funcionario(String nome, String email, String cpf, int idFunc, String tipoFunc) {
        super(nome, email, cpf);
        this.idFunc = idFunc;
        this.tipoFunc = tipoFunc;
    }

    /*GETTERS E SETTERS*/
    public int getIdFunc() {return idFunc;}
    public String getTipoFunc() {return tipoFunc;}

    public void setIdFunc(int idFunc) {this.idFunc = idFunc;}
    public void setTipoFunc(String tipoFunc) {this.tipoFunc = tipoFunc;}

    /*MÉTODOS*/
    public Pessoa contratarFunc(Pessoa p1) {
        return p1;
    }


}
