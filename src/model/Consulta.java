package model;

/* =================================
    Alterada para usar médico objeto
    ==============================*/
public class Consulta {
    private Paciente paciente;
    private String data;
    private String horario;
    private String especialidade;

    // MUDANÇA: antes era String medico
    // AGORA é objeto Medico (controle melhor dos dados)
    private Medico medico;

    public Consulta(Paciente paciente, String data, String horario, String especialidade, Medico medico) {
        this.paciente = paciente;
        this.data = data;
        this.horario = horario;
        this.especialidade = especialidade;
        this.medico = medico;
    }

    public String getCpfPaciente() {
        return paciente.getCpf();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Medico getMedico() {
        return medico;
    }

    public void exibirDetalhes() {
        System.out.println("\n==============================");
        System.out.println("📅 CONSULTA MÉDICA");
        System.out.println("==============================");
        System.out.println("🗓 Data: " + data);
        System.out.println("Horário: " + horario);
        System.out.println("Especialidade: " + especialidade);

        System.out.println("\nMédico:");
        medico.exibirInfo();

        System.out.println("\nPaciente:");
        paciente.exibirInformacoes();
        System.out.println("==============================\n");
    }
}
