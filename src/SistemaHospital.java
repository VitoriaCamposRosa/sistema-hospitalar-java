import java.util.ArrayList;
import model.*;

public class SistemaHospital {
    private ArrayList<Paciente> pacientes = new ArrayList<>();
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public void cadastrarPaciente(String nome, String cpf, int idade, String telefone) {
        for (Paciente p : pacientes) {
            if (p.getCpf().equals(cpf)) {
                System.out.println("Paciente já cadastrado!");
                return;
            }
        }
    
        pacientes.add(new Paciente(nome, cpf, idade, telefone));
        System.out.println("Paciente cadastrado com sucesso!");
    }

    private Paciente buscarPacientePorCpf(String cpf) {
        for (Paciente p : pacientes) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    // Agendamento agora usa Médico objeto
    public void agendarConsulta(String cpf, String data, String horario, String especialidade, Medico medico) {
        Paciente paciente = buscarPacientePorCpf(cpf);

        if (paciente != null) {
            consultas.add(new Consulta(paciente, data, horario, especialidade, medico));
            System.out.println("Consulta agendada com sucesso!");
        } else {
            System.out.println("Paciente não encontrado!");
        }
    }

    /* ====================
        Nova Funcionalidade
        ==================*/
    public void buscarConsultas(String filtro) {
        boolean encontrou = false;

        for (Consulta c : consultas) {
            // busca por múltiplos critérios
            if (c.getCpfPaciente().contains(filtro) ||
                c.getEspecialidade().toLowerCase().contains(filtro.toLowerCase()) ||
                c.getMedico().getNome().toLowerCase().contains(filtro.toLowerCase())) {
                
                c.exibirDetalhes();
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma consulta encontrada para: " + filtro);
        }
    }

    public void listarConsultasPaciente(String cpf) {
        boolean encontrou = false;
        
        for (Consulta c : consultas) {
            if (c.getCpfPaciente().equals(cpf)) {
                c.exibirDetalhes();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma consulta encontrada para este CPF.");
        }
    }
}


