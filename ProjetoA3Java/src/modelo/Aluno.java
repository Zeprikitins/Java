package modelo;

import java.util.Date;

public class Aluno extends Pessoa {
    private int matricula;
    private String situacaoPlano;

    
    public Aluno(String nome, Date dataNascimento, int idade, int cpf, String email, String endereco, String celular,
            int matricula, String situacaoPlano) {
        super(nome, dataNascimento, idade, cpf, email, endereco, celular);
        this.matricula = matricula;
        this.situacaoPlano = situacaoPlano;
    }


    @Override
    public void imprimirDados() {
        System.out.println("Matricula: "+ getMatricula());
        System.out.println("Idade: "+ calcularIdade());
        System.out.println("CPF: "+ getCpf());
        System.out.println("Email: "+ getEmail());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Celular: "+ getCelular());
    }

    public void renovarMatricula(){
        System.out.println("Você renovou sua matricula!!");
    }

    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public String getSituacaoPlano() {
        return situacaoPlano;
    }


    public void setSituacaoPlano(String situacaoPlano) {
        this.situacaoPlano = situacaoPlano;
    }

    
}
