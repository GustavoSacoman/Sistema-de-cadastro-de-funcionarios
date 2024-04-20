import java.util.ArrayList;
import java.util.List;

public class GerenciarFuncionarios {

    
    public static List<Funcionario> listaFuncionarios = new ArrayList<>();
   
//Adiciona funcionario na listaFuncionario
    public static void adicionarFuncionario(Funcionario funcionario){

        listaFuncionarios.add(funcionario);
        System.out.println("Funcionario adicionado com sucesso!!");
    }

//Edita funcionario
    public static void edicaoFuncionario(int matricula){

//Verifica procura funcionario 
        for(Funcionario temp : listaFuncionarios){
            if(matricula == temp.matricula){
                System.out.println("\nFuncionario encontrado!!");
                opcoes(temp);
            }
            
        }

    }

//Motra funcionario desejado
    public static void mostrarFuncionario(){
//Verifica se há funcionarios cadastrados
            if(listaFuncionarios.isEmpty()){
                System.out.println("Nao ha funcionarios cadastrados!!");
                return;
            }

            else{

                System.out.println("\nDigite a matricula do funcionario:");
                int matricula = Console.lerInt();
//Procura funcionario
                for(Funcionario temp : listaFuncionarios){
                    if(temp.matricula == matricula && temp instanceof Gerente){
                        System.out.println("Funcionario encontrado!!");

//Altera o tipo para mostrar todas as informaçoes
                        Gerente gerente = (Gerente) temp;
                        gerente.toString();
                    }
                    else if(temp.matricula == matricula && temp instanceof Tecnico){
                        System.out.println("Funcionario encontrado!!");

//Altera o tipo para mostrar todas as informaçoes
                        Tecnico tecnico = (Tecnico) temp;
                        tecnico.toString();
                    }
                    else if(temp.matricula == matricula && temp instanceof Estagiario){
                        System.out.println("Funcionario encontrado!!");

//Altera o tipo para mostrar todas as informaçoes
                        Estagiario estagiario = (Estagiario) temp;
                        estagiario.toString();
                    }
                    else{System.out.println("Funcionario nao encontrado!!");}
                }
            }
}

//Opcoes para edicao de funcionarios
    public static void opcoes(Funcionario funcionario){

            int opcao;
            do{

//Menu edicao de funcionarios
            System.out.println("\n====Menu====");
            System.out.println("O que deseja alterar ?");
            System.out.println("1- nome");
            System.out.println("2- idade");
            System.out.println("3- Setor");
            System.out.println("4- Carga Horaria");
            System.out.println("5- Formacao");
            System.out.println("6- Matricula");
            System.out.println("7- Projeto/Tarefas/Tempo de estagio");
            System.out.println("0- Voltar ao menu");
            System.out.print("Selecione uma das opcoes: ");
            opcao = Console.lerInt();

            switch (opcao) {

                case 1:

                System.out.print("Digite o novo nome do gerente: ");
                String nome = Console.leString();
                funcionario.setNome(nome);
                break;
                case 2:

                System.out.print("Digite a idade do gerente: ");
                int idade = Console.lerInt();
                funcionario.setIdade(idade);
                    break;
                 case 3:

                 System.out.print("Digite o setor do gerente: ");
                 String setor = Console.leString();
                 funcionario.setSetor(setor);
                    break;
                 case 4:

                 System.out.print("Digite a carga horaria do gerente: ");
                 int carga = Console.lerInt();
                 funcionario.setCargaHoraria(carga);
                    break;
                 case 5:

                 System.out.print("Digite a formacao do gerente: ");
                 String formacao = Console.leString();
                 funcionario.setCurso(formacao);
                    break;
                case 6:

                System.out.print("Digite a matricula do gerente: ");
                int matricula = Console.lerInt();
                funcionario.setMatricula(matricula);
                    break;
                case 7:
//Verifica o tipo de funcionario para que possa alterar o valor correto

                if(funcionario instanceof Gerente){
                    System.out.print("Digite o projeto do gerente: ");
                    String projeto = Console.leString();
//Altera o tipo
                    Gerente gerente = (Gerente) funcionario;
                    gerente.setProjeto(projeto);
                }
                else if(funcionario instanceof Tecnico){
                    System.out.print("Digite as tarefas do tecnico:");
                    String tarefas = Console.leString();
//Altera o tipo
                    Tecnico tecnico = (Tecnico) funcionario;
                    tecnico.setTarefas(tarefas);
                }
                else{
                    System.out.print("Digite o tempo de estagio do estagiario: ");
                    int tempoEstagio = Console.lerInt();
//Altera o tipo
                    Estagiario estagiario = (Estagiario) funcionario;
                    estagiario.setTempoEstagio(tempoEstagio);
                }
            break;
            case 0:

            System.out.println("Voltando.....");
            break;
                default:
                System.out.println("Opcao invalida, tente novamente!");
                    break;
            }
        }while(opcao != 0);
    }
}

