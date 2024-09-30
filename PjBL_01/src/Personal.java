public class Personal extends Funcionario {

    /*DEFINIR ATRIBUTOS*/
    private String treino;

    /*CONSTRUTOR*/
    public Personal(String nome, String email, String cpf, int idFunc, String tipoFunc) {
        super(nome, email, cpf, idFunc, tipoFunc);
    }

    /*GETTERS E SETTERS*/
    public void setTreino(String treino) {
        this.treino = treino;
    }

    /*MÉTODOS*/


    // Método para obter o treino
    public String getTreino() {
        return treino;
    }

}
