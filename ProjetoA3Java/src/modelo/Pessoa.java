
package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public abstract class Pessoa {
    //atributos
    private String nome;
    private Date dataNascimento;
    private int idade;
    private int cpf = 11;
    private String email;
    private String endereco;
    private String celular;
    
    //contrutores
    public Pessoa(String nome, Date dataNascimento, int idade, int cpf, String email, String endereco, String celular) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.celular = celular;
    }

    //pricipais
    public int calcularIdade(){
        LocalDate dataNascimentoLocal = dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimentoLocal, dataAtual).getYears();
    }

    public  abstract void imprimirDados();

    //getter&setter
    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public Date getDataNascimento() {
        return dataNascimento;
    }



    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }



    public int getIdade() {
        return idade;
    }



    public void setIdade(int idade) {
        this.idade = idade;
    }



    public int getCpf() {
        return cpf;
    }



    public void setCpf(int cpf) {
        this.cpf = cpf;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getEndereco() {
        return endereco;
    }



    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    public String getCelular() {
        return celular;
    }



    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
}
