public class Assinante extends Pessoa {
    private int idAss;
    private String tipoAss;
    private double valor;

    /*CONSTRUTOR*/
    public Assinante(int idAss, String nome, String email, String cpf,  String tipoAss, double valor) {
        super(nome, email, cpf);
        this.idAss = idAss;
        this.tipoAss = tipoAss;
        this.valor = valor;

    }

    /*GETTERS E SETTERS*/
    public int getIdAss() {return idAss;}
    public String getTipoAss() {return tipoAss;}

    public void setIdAss(int idAss) {this.idAss = idAss;}
    public void setTipoAss(String tipoAss) {this.tipoAss = tipoAss;}

    /*MÉTODOS*/
    public void acessar(int idAss) { }




    public Pessoa cadastrarAss(Pessoa p) {


        Assinante a = new Assinante(1, p.getNome(), p.getEmail(), p.getCpf(), "Black", 99.99);
        return a;




    }

}
