package view;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Aluno;
import modelo.Professor;
import modelo.Treino;


public class Executavel{
public static void main(String[] args) {
    ArrayList<Professor> professores = new ArrayList<>();
  ArrayList<Aluno> alunos = new ArrayList<>();
  Calendar c = Calendar.getInstance();

  Treino treino = new Treino(null, null, 0, 0, null, null, null, null, null, null, 0, professores, alunos);

  for(int i = 0; i < 1; i++){
    JOptionPane.showMessageDialog(null, "Professor: " + (i+1));
    int idProfessor = Integer.parseInt(JOptionPane.showInputDialog("Id do professor: "));
    String especialidade = JOptionPane.showInputDialog("Especialidade: ");
    double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
    String situacao = JOptionPane.showInputDialog("Situação: ");
    String nome = JOptionPane.showInputDialog("Nome: ");
    
    int ano = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento(Ano): "));
    int mes = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento(mes): "));
    int dia = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento(dia): "));
    int cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF: "));
    String email = JOptionPane.showInputDialog("Email: ");
    String endereco = JOptionPane.showInputDialog("Endereço: ");
    String numero = JOptionPane.showInputDialog("Número: ");

    c.set(ano, mes - 1, dia);
    Date dataNascimentoProfessor = c.getTime();

    Professor professor = new Professor(nome, dataNascimentoProfessor, i, cpf, email, endereco, numero, idProfessor, especialidade, salario, situacao);
    professores.add(professor);
  }
  for(int i = 0; i < 1; i++){
    JOptionPane.showMessageDialog(null, "Aluno: " + (i+1));
    int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula do Aluno: "));
    String situacao = JOptionPane.showInputDialog("Situação: ");
    String nome = JOptionPane.showInputDialog("Nome: ");
    
    int ano = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento(Ano): "));
    int mes = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento(mes): "));
    int dia = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento(dia): "));
    int cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF: "));
    String email = JOptionPane.showInputDialog("Email: ");
    String endereco = JOptionPane.showInputDialog("Endereço: ");
    String numero = JOptionPane.showInputDialog("Número: ");

c.set(ano, mes, dia);
Date dataNascimentoAluno = c.getTime();

    Aluno aluno = new Aluno(nome, dataNascimentoAluno, i, cpf, email, endereco, numero, matricula, situacao);
    System.out.println();
    alunos.add(aluno);
}

System.out.println();

System.out.println("\nDados do Professor: ");
for(Professor professor : professores){
    professor.calcularIdade();
    professor.imprimirDados();
}
System.out.println();

System.out.println("Dados do Aluno: ");
for(Aluno aluno : alunos){
    aluno.calcularIdade();
    aluno.imprimirDados();
    
}
}
}



