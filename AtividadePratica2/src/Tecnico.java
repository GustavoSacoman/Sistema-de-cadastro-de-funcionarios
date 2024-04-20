public class Tecnico extends Funcionario {
    
    
    
    String tarefas;

    public Tecnico(String nome, int idade, String setor, int cargaHoraria, String curso,int matricula, String tarefas){
        super(nome, idade, setor, cargaHoraria, curso,matricula);
        this.tarefas = tarefas;
        
    }   
    public String getTarefas() {
        return tarefas;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setTarefas(String tarefas) {
        this.tarefas = tarefas;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


}
