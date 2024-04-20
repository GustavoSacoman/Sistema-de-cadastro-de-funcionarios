public class Sistema {

    //Exibe menu
    public static void exibirMenu(){

        System.out.println("=====Menu=====");
        System.out.println("1- Cadastrar gerente");
        System.out.println("2- Cadastrar tecnico");
        System.out.println("3- Cadastrar estagiario");
        System.out.println("4- Mostrar funcionarios");
        System.out.println("5- Editar cadastros");
        System.out.println("6- Excluir cadastros");
        System.out.println("0- Sair ");

        System.out.print("Digite uma das opcoes acima:");

    }

    public static void verificaOpcao(int opcao){
     
        switch (opcao) {
            case 1:
            //Usuário digita todas as informações do gerente 
                System.out.print("Digite o nome do gerente: ");
                String nome = Console.leString();
                System.out.print("Digite a idade do gerente: ");
                int idade = Console.lerInt();
                System.out.print("Digite o setor do gerente: ");
                String setor = Console.leString();
                System.out.print("Digite a cargahoraria do gerente (Em numeros inteiros): ");
                int cargaHoraria = Console.lerInt();
                System.out.print("Digite a formacao do gerente: ");
                String formacao = Console.leString();
                System.out.print("Digite a matricula do gerente: ");
                int matricula = Console.lerInt();
                System.out.print("Digite o nome do projeto em que o gerente esta participando: ");
                String nomeProjeto = Console.leString();

            //Coloca todas a informações digitadas pelo o usuario
                Gerente gerente = new Gerente(nome, idade, setor, cargaHoraria, formacao,matricula,nomeProjeto);
                GerenciarFuncionarios.adicionarFuncionario(gerente);
                break;
            case 2:
                 //Usuário digita todas as informações do tecnico 
                System.out.print("Digite o nome do tecnico: ");
                nome = Console.leString();
                System.out.print("Digite a idade do tecnico: ");
                idade = Console.lerInt();
                System.out.print("Digite o setor do tecnico: ");
                setor = Console.leString();
                System.out.print("Digite a cargahoraria do tecnico (Em numeros inteiros): ");
                cargaHoraria = Console.lerInt();
                System.out.print("Digite a formacao do tecnico: ");
                formacao = Console.leString();
                System.out.print("Digite as tarefas do tecnico: ");
                String tarefas = Console.leString();
                System.out.print("Digite a matricula do tecnico: ");
                matricula = Console.lerInt();

                Tecnico tecnico = new Tecnico(nome, idade, setor, cargaHoraria, formacao, matricula, tarefas);
                GerenciarFuncionarios.adicionarFuncionario(tecnico);
                break;
            case 3:

                 //Usuário digita todas as informações do estagiario
                System.out.print("Digite o nome do estagiario: ");
                nome = Console.leString();
                System.out.print("Digite a idade do estagiario: ");
                idade = Console.lerInt();
                System.out.print("Digite o setor do estagiario: ");
                setor = Console.leString();
                System.out.print("Digite a cargahoraria do estagiario (Em numeros inteiros): ");
                cargaHoraria = Console.lerInt();
                System.out.print("Digite o curso que o estagiario esta cursando: ");
                formacao = Console.leString();
                System.out.print("Digite a matricula do Estagiario: ");
                matricula = Console.lerInt();
                System.out.print("Digite o tempo de estagio em anos do estagiario: ");
                int tempoEstagio = Console.lerInt();

                Estagiario estagiario = new Estagiario(nome, idade, setor, cargaHoraria, formacao, matricula, tempoEstagio);
                GerenciarFuncionarios.adicionarFuncionario(estagiario);
                break;

            case 4:
                //Mostra as informações do funcionario selecionado
                GerenciarFuncionarios.mostrarFuncionario();
                break;
            case 5:
            //Edita as informações do funcionario selecionado
                System.out.print("\nDigite a matricula do funcionario: ");
                matricula = Console.lerInt();
                GerenciarFuncionarios.edicaoFuncionario(matricula);
                break;
            case 6:
            //Exluir os funcionarios da lista
            //Duas opcoes ou exclui somente 1 ou exlcui todos
                System.out.println("=====Menu=====");
                System.out.println("1-Excluir um funcionario");
                System.out.println("2-Excluir todos os funcionarios");
                System.out.print("Selecione uma das opcoes: ");
                opcao = Console.lerInt();

                switch (opcao) {
                    case 1:
                    
                        System.out.print("Digite a matricula:");
                        matricula = Console.lerInt();
                        if(GerenciarFuncionarios.excluirFuncionario(matricula))
                        System.out.println("\nFuncionario removido com sucesso");
                        else{
                            System.out.println("\nFuncionário " + matricula + " não localizado no cadastro");
                        }
                        break;
                    case 2:
    
                    GerenciarFuncionarios.excluirTodosFuncionarios();
                
                    break;
                    default:

                    System.out.println("Opcao invalida, tente novamente!");

                        break;
                }
                break;
                //Finaliza o programa
                case 0:
                System.out.println("\nFinalizando sistema....");
                System.exit(0);
            default:
                System.out.println("Opcao invalida, tente novamente!");
                break;
            }

        }

    public static void executarPrograma(){
//Inicio de tudo
        int opcao;
        do {

            exibirMenu();
            opcao = Console.lerInt();
            verificaOpcao(opcao);

        } while (opcao != 0);
    }

}
