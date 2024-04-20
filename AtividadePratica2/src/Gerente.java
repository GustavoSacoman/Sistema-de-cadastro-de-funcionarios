public class Gerente extends Funcionario {
    
//Atributos

   private String projeto;
//Construtor

    public Gerente(String nome, int idade, String setor, int cargaHoraria, String curso, int matricula, String projeto){
        super(nome, idade, setor, cargaHoraria, curso,matricula);
        
        this.projeto = projeto;
    }
    
//Getters e setters

    public String getProjeto() {
        return projeto;
    }
    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
 //Mostrar as informaçoes do funcionario

   @Override
   public String toString() {
       return super.toString() + "\nProjeto: \n" + projeto;
   }
    
    
}
