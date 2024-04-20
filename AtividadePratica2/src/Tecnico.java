public class Tecnico extends Funcionario {
    
//Atributos
    
    private String tarefas;
//Construtor

    public Tecnico(String nome, int idade, String setor, int cargaHoraria, String curso,int matricula, String tarefas){
        super(nome, idade, setor, cargaHoraria, curso,matricula);
        this.tarefas = tarefas;

//Getters e setters

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
 //Mostrar as informaçoes do funcionario
 
    @Override
    public String toString() {
        return super.toString() + "\nTarefas: \n" + tarefas;
    }
}
