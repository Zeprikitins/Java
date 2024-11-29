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
            String dias, String horario, String descricao, int duracao, ArrayList<Professor> professores,
            ArrayList<Aluno> alunos) {
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
        System.out.println("Treino: ");
        System.out.println("Dias: " + dias);
        System.out.println("Horário: " + horario);
        System.out.println("Descrição: " + descricao);
        System.out.println("Duração: " + duracao);
        System.out.println();
        System.out.println("Professores: ");
        for(Professor professor : professores){
            professor.imprimirDados();
        }
        System.out.println();
        System.out.println("Alunos: ");
        for(Aluno aluno : alunos){
            aluno.imprimirDados();
        }
    }

    public void adicionarAluno(Aluno aluno) { 
        
        if("Ativo".equals(aluno.getSituacaoPlano())){
          alunos.add(aluno);
          System.out.println("Aluno adicionado: " + aluno.getNome());
        }else{
            aluno.renovarMatricula();
            System.out.println();
            aluno.imprimirDados();
        }
    }
        public void adicionarProfessor(Professor professor){
            if("Ativo".equals(professor.getSituacao())){
                professores.add(professor); 
                System.out.println("Professor adicionado: " + professor.getNome());
            }else{
            System.out.println("Professor Inativo!!");    
            }
        }

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
           public ArrayList<Aluno> getAlunos() {
        return alunos;
    }     
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }
    }
