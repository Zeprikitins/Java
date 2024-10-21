package modelo;

import java.util.Calendar;
import java.util.Date;

public class Executavel {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2015, Calendar.JANUARY, 15);
        Date dataNascimentoCobra = cal.getTime();
        Cobra cobra = new Cobra(Boolean.TRUE, "Jararaca", 1, "Carlos", dataNascimentoCobra, 'M', "Grande", 2, "Saudável", "Aquário");
        cal.set(2010, Calendar.FEBRUARY, 20);
        Date dataNascimentoElefante = cal.getTime();
        Elefante elefante = new Elefante(2, "Lala", dataNascimentoElefante, 'F', "Grande", 460, "Saudável", "Poço");
        cal.set(2012, Calendar.MARCH, 25);
        Date dataNascimentoArara = cal.getTime();
        Arara arara = new Arara("Azul", 10, "Eduardo", dataNascimentoArara, 'M', "Pequeno", 2, "Saudável", "Aviário");
        cal.set(2009, Calendar.APRIL, 17);
        Date dataNascimentoGaviao = cal.getTime();
        Gaviao gaviao = new Gaviao("Montanha", 3, "Matuzalem", dataNascimentoGaviao, 'M', "Pequeno", 2, "Saudável", "Aviário");
        cal.set(2007, Calendar.MAY, 6);
        Date dataNascimentoMacaco = cal.getTime();
        Macaco macaco = new Macaco("Simion", 4, "Miudo", dataNascimentoMacaco, 'M', "Pequeno", 4, "Saudável", "Árvore");
        cal.set(2008, Calendar.JUNE, 3); 
        Date dataNascimentoOnca = cal.getTime();
        Onca onca = new Onca(5, "Yasmin", dataNascimentoOnca, 'F', "Média", 8, "Saudável", "Jaula");
        cal.set(2001, Calendar.JULY, 10);
        Date dataNascimentoleao = cal.getTime();
        Leao leao = new Leao(6, "Victor", dataNascimentoleao, 'M', "Grande", 90, "Machucado", "Jaula");
        cal.set(2008, Calendar.AUGUST, 15);
        Date dataNascimentoZebra = cal.getTime();
        Zebra zebra = new Zebra(7, "Filipi", dataNascimentoZebra, 'M', "Média", 40, "Saudável", "Floresta");
        cal.set(2006, Calendar.SEPTEMBER, 20);
        Date dataNascimentoGirafa = cal.getTime();
        Girafa girafa = new Girafa(8, "Yanni", dataNascimentoGirafa, 'F', "Grande", 120, "Saudável", "Casa");
        cal.set(2008, Calendar.OCTOBER, 2);
        Date dataNascimentoHipopotamo = cal.getTime();
        Hipopotamo hipopotamo = new Hipopotamo(9, "Matheus", dataNascimentoHipopotamo, 'M', "Grande", 500, "Saudável", "Poço");
        
        cobra.imprimir();
        System.out.println("");
        elefante.imprimir();
        System.out.println("");
        arara.imprimir();
        System.out.println("");
        gaviao.imprimir();
        System.out.println("");
        macaco.imprimir();
        System.out.println("");
        onca.imprimir();
        System.out.println("");
        leao.imprimir();
        System.out.println("");
        zebra.imprimir();
        System.out.println("");
        girafa.imprimir();
        System.out.println("");
        hipopotamo.imprimir();
        System.out.println("");
        
    }
}



