public class Gerente extends Funcionario {
    
    
    String projeto;

    public Gerente(String nome, int idade, String setor, int cargaHoraria, String curso, int matricula, String projeto){
        super(nome, idade, setor, cargaHoraria, curso,matricula);
        
        this.projeto = projeto;
    }
    
    
    public String getProjeto() {
        return projeto;
    }
    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    
   @Override
   public String toString() {
       return super.toString() + "\nProjeto: " + projeto;
   }
    
    
}
