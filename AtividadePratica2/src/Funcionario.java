public class Funcionario {
    
//Atributos
   protected String nome;
   protected int idade;
   protected String setor;
   protected int cargaHoraria;
   protected String curso;
   protected int matricula;
//Construtor
    public Funcionario(String nome, int idade, String setor, int cargaHoraria, String curso,int matricula){
        this.nome = nome;
        this.idade = idade;
        this.setor = setor;
        this.cargaHoraria = cargaHoraria;
        this.curso = curso;
        this.matricula = matricula;
    }

    //Getters e setters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getSetor() {
        return setor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getCurso() {
        return curso;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //Mostrar as informaçoes do funcionario
    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nIdade: " + idade +
               "\nSetor:" + setor +
               "\nCarga Horaria: " + cargaHoraria +
               "\nFormacao: " + curso +
               "\nMatricula: " + matricula;    
    }


}
