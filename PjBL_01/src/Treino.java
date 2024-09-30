public class Treino {
    private int qntExercicios;
    private int tempoTotal;
    private int tempoIntervalo;

    /*CONSTRUTOR*/
    public Treino(int qntExercicios, int tempoTotal, int tempoIntervalo, String exercicios) {
        this.qntExercicios = qntExercicios;
        this.tempoTotal = tempoTotal;
        this.tempoIntervalo = tempoIntervalo;
    }

    /*GETTERS E SETTERS*/
    public int getQntExercicios() {return qntExercicios;}
    public int getTempoTotal() {return tempoTotal;}
    public int getTempoIntervalo() {return tempoIntervalo;}

    public void setQntExercicios(int qntExercicios) {this.qntExercicios = qntExercicios;}
    public void setTempoTotal(int tempoTotal) {this.tempoTotal = tempoTotal;}
    public void setTempoIntervalo(int tempoIntervalo) {this.tempoIntervalo = tempoIntervalo;}

    /*MÉTODOS*/
    public void criarTreino(int idAss, int tempoTotal, int tempoIntervalo, int quantExercicios) {

    }


}
