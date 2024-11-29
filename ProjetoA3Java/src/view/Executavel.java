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
    while (true){
        String[] options = {"Consultar Treino", "Adicionar Treino", "Adicionar Professor", "Adicionar Aluno", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma das Opções: ", "Menu", JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (escolha == 0){
            if(treino != null){
                treino.imprimirDados();
            }else{
                System.out.println("Nenhum treino disponivel!!");
            }
        }else if (escolha == 1){
            String dias = JOptionPane.showInputDialog("Dias do treino: ");
            String horario = JOptionPane.showInputDialog("Horário do treino: ");
            String descricao = JOptionPane.showInputDialog("Descrição do treino: ");
            int dueacao = Integer.parseInt(JOptionPane.showInputDialog("Duração do treino(minutos): "));
            treino = new Treino(descricao, null, dueacao, escolha, descricao, descricao, descricao, dias, horario, descricao, dueacao, professores, alunos);
            }else if (escolha == 2) {
                JOptionPane.showMessageDialog(null, "Adicionar Professor");
                int idProfessor = Integer.parseInt(JOptionPane.showInputDialog("Id do Professor: "));
                String especialidade = JOptionPane.showInputDialog("Especialidade: ");
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
                String situacao = JOptionPane.showInputDialog("Situacao: ");
                String nome = JOptionPane.showInputDialog("Nome: ");

                int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento: "));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês de Nascimento: "));
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia de Nascimento: "));
                int cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF: "));
                String email = JOptionPane.showInputDialog("Email: ");
                String endereco = JOptionPane.showInputDialog("Endereço: ");
                String numero = JOptionPane.showInputDialog("Número: ");

                c.set(ano, mes -1, dia);
                Date dataNascimentoProfessor = c.getTime();

                Professor professor = new Professor(nome, dataNascimentoProfessor, dia, cpf, email, endereco, numero, idProfessor, especialidade, salario, situacao);
                professores.add(professor);
                treino.setProfessores(professores);
                       }else if (escolha == 3){
                        JOptionPane.showMessageDialog(null, "Adicionar Aluno");

                        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula do Aluno: "));
                String situacao = JOptionPane.showInputDialog("Situacao: ");
                String nome = JOptionPane.showInputDialog("Nome: ");

                int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento: "));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês de Nascimento: "));
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia de Nascimento: "));
                int cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF: "));
                String email = JOptionPane.showInputDialog("Email: ");
                String endereco = JOptionPane.showInputDialog("Endereço: ");
                String numero = JOptionPane.showInputDialog("Número: ");

                c.set(ano, mes -1, dia);
                Date dataNascimentoAluno = c.getTime();

                Aluno aluno = new Aluno(nome, dataNascimentoAluno, dia, cpf, email, endereco, numero, matricula, situacao);
                alunos.add(aluno);
                treino.setAlunos(alunos);
                       } else if (escolha == 4 ) {
                break;
            }else{
                System.out.println("Inválido!!");
            }
    }
    System.out.println("\nDados do Professor: ");
    for(Professor professor : professores){
        professor.calcularIdade();
        professor.imprimirDados();
    }
    System.out.println();
    System.out.println("\nDados do Aluno: ");
    for(Aluno aluno : alunos){
        aluno.calcularIdade();
        aluno.imprimirDados();
    }
}
}



