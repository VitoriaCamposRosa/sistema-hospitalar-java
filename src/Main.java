import java.util.Scanner;
import model.Medico;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaHospital sistema = new SistemaHospital();

        while (true) { 
            System.out.println("\n==============================");
            System.out.println("🏥 SISTEMA HOSPITALAR");
            System.out.println("==============================");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Agendar Consulta");
            System.out.println("3 - Listar Consultas de um Paciente");
            System.out.println("4 - Buscar Consultas (NOVA)");
            System.out.println("5 - Sair");
            System.out.print("-> Escolha uma opção: ");
    
            int opcao = Integer.parseInt(scanner.nextLine());
            System.out.println();

            if (opcao == 1) {
                System.out.println("CADASTRO PACIENTE");
                System.out.printf("---\n");

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("CPF: ");
                String cpf = scanner.nextLine();

                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();

                sistema.cadastrarPaciente(nome, cpf, idade, telefone);

            } else if (opcao == 2) {
                System.out.println("CADASTRO CONSULTA");
                System.out.printf("---\n");

                System.out.print("CPF do paciente: ");
                String cpf = scanner.nextLine(); 

                System.out.print("Data (dd/mm/aaaa): ");
                String data = scanner.nextLine();

                System.out.print("Horário (hh:mm): ");
                String horario = scanner.nextLine();

                System.out.print("Especialidade: ");
                String especialidade = scanner.nextLine();

                System.out.printf("=================================");

                System.out.println("CADASTRO MÉDICO");
                System.out.printf("---\n");

                // NOVO: cadastro do médico
                System.out.print("Nome do médico: "); // -> Nome do médico
                String nomeMedico = scanner.nextLine();

                System.out.print("CRM: "); // -> CRM do Médico
                String crm = scanner.nextLine();

                System.out.print("Especialidade do médico: "); // -> Especialidade do médico
                String espMedico = scanner.nextLine();

                Medico medico = new Medico(nomeMedico, crm, espMedico);
                sistema.agendarConsulta(cpf, data, horario, especialidade, medico);

            } else if (opcao == 3) {
                System.out.println("LISTAGEM DAS CONSULTAS DO PACIENTE");
                System.out.printf("---\n");

                System.out.print("CPF do paciente: ");
                String cpf = scanner.nextLine();
                sistema.listarConsultasPaciente(cpf);

                // buscaConsultas = Nova funcionalidade inserida
            } else if (opcao == 4) {
                System.out.println("BUSCA DE CONSULTA");
                System.out.printf("---\n");
                
                System.out.print("Digite filtro (CPF, médico ou especialidade): ");
                String filtro = scanner.nextLine();
                sistema.buscarConsultas(filtro);

            } else if (opcao == 5) {
                System.out.println("SAINDO DO SISTEMA");
                System.out.printf("---\n");

                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}
