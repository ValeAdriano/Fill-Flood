public class AssBlack extends Assinante {

    /*DEFINIR ATRIBUTOS*/

    /*CONSTRUTOR*/
    public AssBlack(int idAss, String nome, String email, String cpf,  String tipoAss, double valor) {
        super(idAss, nome, email, cpf,  tipoAss, valor);
    }

    /*GETTERS E SETTERS*/


    /*MÉTODOS*/


    // Método para visualizar o treino feito pela classe Personal
    public void visualizarTreino(Personal personal) {
        String treino = personal.getTreino();
        System.out.println("Treino do Personal: " + treino);
    }

}
