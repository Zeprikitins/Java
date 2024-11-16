package modelo;

import java.util.Date;

public class Professor extends Pessoa{
    private int idProfessor;
    private String especialidade;
    private double salario;
    private String situacao;

    
    public Professor(String nome, Date dataNascimento, int idade, int cpf, String email, String endereco,
            String celular, int idProfessor, String especialidade, double salario, String situacao) {
        super(nome, dataNascimento, idade, cpf, email, endereco, celular);
        this.idProfessor = idProfessor;
        this.especialidade = especialidade;
        this.salario = salario;
        this.situacao = situacao;
    }

    @Override
    public void imprimirDados() {
        System.out.println("ID: "+ getIdProfessor());
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ calcularIdade());
        System.out.println("CPF: "+ getCpf());
        System.out.println("Email: "+ getEmail());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Celular: "+ getCelular());
        System.out.println("Especialidade: "+ getEspecialidade());
        System.out.println("Salario: "+ getSalario());
    }

    public int getIdProfessor() {
        return idProfessor;
    }


    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }


    public String getEspecialidade() {
        return especialidade;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String getSituacao() {
        return situacao;
    }


    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    
}
