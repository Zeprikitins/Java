package view;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Professor;


public class Executavel{
public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
        cal.set(2015, Calendar.JANUARY, 15);
        Date dataNascimentoAluno1 = cal.getTime();
    Aluno aluno1 = new Aluno("Isis", dataNascimentoAluno1, 15, 1000000000, "ajsdgakijbdakjsdb", "iouagdjabjkbsd", "999999999", 1, "Presente");
        cal.set(2000, Calendar.MARCH, 15);
        Date dataNascimentoProf1 = cal.getTime();
    Professor professor1 = new Professor("Gabriela", dataNascimentoProf1, 24, 00000000000, "jabkjbdfjbfjbd", "jkljlkfhklasfaksf", "jghajdlajkhdlka", 1, "Musculacao", 1220, "Ativo");
    
      String[] primeiraOpcoes = {"Renovar Matrícula", "Ver Dados"};  int escolhaInicial = JOptionPane.showOptionDialog( null, "Escolha uma opção:", "Opções Iniciais", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, primeiraOpcoes,  primeiraOpcoes[0]); 
      if (escolhaInicial == 0) {  String[] renovarOpcoes = {"Confirmar Renovação", "Cancelar Renovação"};  int escolhaRenovar = JOptionPane.showOptionDialog( null, "Escolha uma opção:",  "Opções de Renovação", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, renovarOpcoes,  renovarOpcoes[0] ); 
       if (escolhaRenovar == 0) { aluno1.renovarMatricula(); } 
       else if (escolhaRenovar == 1) { System.out.println("Você escolheu cancelar a renovação da matrícula."); } 
       else { System.out.println("Nenhuma opção foi escolhida."); } } else if (escolhaInicial == 1) { String[] verDadosOpcoes = {"Ver Dados Pessoais", "Ver Dados Acadêmicos"};  int escolhaVerDados = JOptionPane.showOptionDialog( null, "Escolha uma opção:", "Opções de Dados", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,  verDadosOpcoes,  verDadosOpcoes[0] ); 
      if (escolhaVerDados == 0) { aluno1.imprimirDados(); } 
       else if (escolhaVerDados == 1) { aluno1.getSituacaoPlano();} 
      else { System.out.println("Nenhuma opção foi escolhida."); } } else { System.out.println("Nenhuma opção foi escolhida."); }
    
}
}


