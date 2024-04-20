public class Estagiario extends Funcionario {

    
    int tempoEstagio;


    public Estagiario(String nome, int idade, String setor, int cargaHoraria, String curso,int matricula, int tempoEstagio){
        super(nome, idade, setor, cargaHoraria, curso, matricula);
        this.tempoEstagio = tempoEstagio;
    }

    public String getCurso() {
        return curso;
    }
    public int getTempoEstagio() {
        return tempoEstagio;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setTempoEstagio(int tempoEstagio) {
        this.tempoEstagio = tempoEstagio;
    }

    
}
