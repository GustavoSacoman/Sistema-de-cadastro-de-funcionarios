import java.util.ArrayList;
import java.util.List;

/**
 * GerenciarFuncionarios
 */
public class GerenciarFuncionarios {

    
    public static List<Funcionario> listaFuncionarios = new ArrayList<>();
   

    public static void adicionarFuncionario(Funcionario funcionario){

        listaFuncionarios.add(funcionario);
        System.out.println("Funcionario adicionado com sucesso!!");
    }

    public static void edicaoGerente(int matricula){
       
        for(Funcionario temp : listaFuncionarios){
            if(temp instanceof Gerente && matricula == temp.matricula ){
                Gerente gerente = (Gerente) temp;
                System.out.println("Gerente encontrado!!");

                int opcao;
                do{
                System.out.println("====Menu====");
                System.out.println("O que deseja alterar ?");
                System.out.println("1- nome");
                System.out.println("2- idade");
                System.out.println("3- Setor");
                System.out.println("4- Carga Horaria");
                System.out.println("5- Formacao");
                System.out.println("6- Matricula");
                System.out.println("7- Projeto");
                System.out.println("0- Voltar ao menu");
                opcao = Console.lerInt();

                switch (opcao) {
                    case 1:
                    System.out.print("Digite o novo nome do gerente: ");
                    String nome = Console.leString();
                    gerente.setNome(nome);
                    break;
                    case 2:
                    System.out.print("Digite a idade do gerente: ");
                    int idade = Console.lerInt();
                    gerente.setIdade(idade);
                        break;
                     case 3:
                     System.out.print("Digite o setor do gerente: ");
                     String setor = Console.leString();
                     gerente.setSetor(setor);
                        break;
                     case 4:
                     System.out.print("Digite a carga horaria do gerente: ");
                     int carga = Console.lerInt();
                     gerente.setCargaHoraria(carga);
                        break;
                     case 5:
                     System.out.print("Digite a formacao do gerente: ");
                     String formacao = Console.leString();
                     gerente.setCurso(formacao);
                        break;
                    case 6:
                    System.out.print("Digite a matricula do gerente: ");
                    matricula = Console.lerInt();
                    gerente.setMatricula(matricula);
                        break;
                    case 7:
                    System.out.print("Digite o nome do projeto; ");
                    String projeto = Console.leString();
                    gerente.setProjeto(projeto);
                
                    default:
                        break;
                }
            }while(opcao != 0);
            }
            
        }




    }

    public static void editarTecnico(int matricula){

        for(Funcionario temp : listaFuncionarios){
            if (temp instanceof Tecnico && temp.matricula == matricula) {
                Tecnico tecnico = (Tecnico) temp;
                System.out.println("Tecnico encontrado!!");

                int opcao;
                do{
                System.out.println("====Menu====");
                System.out.println("O que deseja alterar ?");
                System.out.println("1- nome");
                System.out.println("2- idade");
                System.out.println("3- Setor");
                System.out.println("4- Carga Horaria");
                System.out.println("5- Formacao");
                System.out.println("6- Matricula");
                System.out.println("7- Tarefas");
                System.out.println("0- Voltar ao menu");
                opcao = Console.lerInt();

                switch (opcao) {
                    case 1:
                    System.out.print("Digite o novo nome do tecnico: ");
                    String nome = Console.leString();
                    tecnico.setNome(nome);
                    break;
                    case 2:
                    System.out.print("Digite a idade do tecnico: ");
                    int idade = Console.lerInt();
                    tecnico.setIdade(idade);
                        break;
                     case 3:
                     System.out.print("Digite o setor do tecnico: ");
                     String setor = Console.leString();
                     tecnico.setSetor(setor);
                        break;
                     case 4:
                     System.out.print("Digite a carga horaria do tecnico: ");
                     int carga = Console.lerInt();
                     tecnico.setCargaHoraria(carga);
                        break;
                     case 5:
                     System.out.print("Digite a formacao do tecnico: ");
                     String formacao = Console.leString();
                     tecnico.setCurso(formacao);
                        break;
                    case 6:
                    System.out.print("Digite a matricula do tecnico: ");
                    matricula = Console.lerInt();
                    tecnico.setMatricula(matricula);
                        break;
                    case 7:
                    System.out.print("Digite o nome do projeto; ");
                    String tarefas = Console.leString();
                    tecnico.setTarefas(tarefas);;
                
                    default:
                        break;
                }
            }while(opcao != 0);
            }

            }
        }
        public static void editarEstagiario(int matricula){
            for(Funcionario temp : listaFuncionarios){
                if (temp instanceof Estagiario && temp.matricula == matricula) {
                    Estagiario estagiario = (Estagiario) temp;
                    System.out.println("Tecnico encontrado!!");

                int opcao;
                do{
                System.out.println("====Menu====");
                System.out.println("O que deseja alterar ?");
                System.out.println("1- nome");
                System.out.println("2- idade");
                System.out.println("3- Setor");
                System.out.println("4- Carga Horaria");
                System.out.println("5- Formacao");
                System.out.println("6- Matricula");
                System.out.println("7- Tarefas");
                System.out.println("0- Voltar ao menu");
                opcao = Console.lerInt();

                switch (opcao) {
                    case 1:
                    System.out.print("Digite o novo nome do tecnico: ");
                    String nome = Console.leString();
                    estagiario.setNome(nome);
                    break;
                    case 2:
                    System.out.print("Digite a idade do tecnico: ");
                    int idade = Console.lerInt();
                    estagiario.setIdade(idade);
                        break;
                     case 3:
                     System.out.print("Digite o setor do tecnico: ");
                     String setor = Console.leString();
                     estagiario.setSetor(setor);
                        break;
                     case 4:
                     System.out.print("Digite a carga horaria do tecnico: ");
                     int carga = Console.lerInt();
                     estagiario.setCargaHoraria(carga);
                        break;
                     case 5:
                     System.out.print("Digite a formacao do tecnico: ");
                     String formacao = Console.leString();
                     estagiario.setCurso(formacao);
                    break;
                    case 6:
                    System.out.print("Digite a matricula do tecnico: ");
                    matricula = Console.lerInt();
                    estagiario.setMatricula(matricula);
                        break;
                    case 7:
                    System.out.print("Digite o tempo de estagio: ");
                    int tempoEstagio = Console.lerInt();
                    estagiario.setTempoEstagio(tempoEstagio);
                
                    default:
                        break;
                }
            }while(opcao != 0);
            }

                }
            }
}

