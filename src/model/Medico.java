package model;

/* ===================
    Nova Classe: Médico 
    ================*/
public class Medico {
    private String nome;
    private String crm;
    private String especialidade_med;

    public Medico(String nome, String crm, String especialidade_med) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade_med = especialidade_med;
    }

     public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade_med;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade_med);
    }

}
