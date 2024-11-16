package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Treino extends Pessoa{
    private String dias;
    private String horario;
    private String descricao;
    private int duracao;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    
    public Treino(String nome, Date dataNascimento, int idade, int cpf, String email, String endereco, String celular,
            String dias, String horario, String descricao, int duracao, ArrayList<Professor> professores, ArrayList<Aluno> alunos) {
        super(nome, dataNascimento, idade, cpf, email, endereco, celular);
        this.dias = dias;
        this.horario = horario;
        this.descricao = descricao;
        this.duracao = duracao;
        this.professores = professores;
        this.alunos = alunos;
    }
    @Override
    public void imprimirDados() {
        
    }

    public void adicionarAluno(Aluno aluno) { 
        alunos.add(aluno); }
        public void adicionarProfessor(Professor professor) { 
            professores.add(professor); }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
}
