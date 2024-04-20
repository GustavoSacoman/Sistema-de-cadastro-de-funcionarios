public class Sistema {
    
    public static void exibirMenu(){

        System.out.println("=====Menu=====");
        System.out.println("1- Cadastrar gerente");
        System.out.println("2- Cadastrar tecnico");
        System.out.println("3- Cadastrar estagiario");
        System.out.println("4- Editar cadastros");
        System.out.println("5- Excluir cadastros");
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
                
                System.out.println("=====Edicao de funcionarios=====");
                System.out.println("1- Editar gerente");
                System.out.println("1- Editar tecnico");
                System.out.println("1- Editar estagiario");

                int opcoesEdit = Console.lerInt();

                switch (opcoesEdit) {
                    
                    case 1:
                    System.out.print("informe a matricula do gerente: ");
                    matricula = Console.lerInt();
                    GerenciarFuncionarios.edicaoGerente(matricula);
                    break;
                    case 2:
                    System.out.print("informe a matricula do tecnico: ");
                    matricula = Console.lerInt();
                    GerenciarFuncionarios.editarTecnico(matricula);
                    break;
                    case 3:
                    System.out.print("informe a matricula do estagiario: ");
                    matricula = Console.lerInt();
                    GerenciarFuncionarios.editarEstagiario(matricula);
                    break;
                    default:
                    System.out.println("opcao incorreta, informe um valor valido!");
                        break;
                }

            default:
                break;
        }
  

    }


    public static void executarPrograma(){

        int opcao;
        do {

            exibirMenu();
            opcao = Console.lerInt();
            verificaOpcao(opcao);

        } while (opcao != 0);
    }

}
