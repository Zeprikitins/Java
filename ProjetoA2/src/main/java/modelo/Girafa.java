
package modelo;

import java.util.Date;

public class Girafa extends Animal{

    public Girafa(int identificador, String nome, Date dataNascimento, char sexo, String tamanho, double peso, String situacao, String recinto) {
        super(identificador, nome, dataNascimento, sexo, tamanho, peso, situacao, recinto);
    }
    
    
    public void imprimir(){
        System.out.println("Girafa: ");
        System.out.println("Identificador: "+ getIdentificador());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: "+ calcularIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Tamanho: "+ getTamanho());
        System.out.println("Peso: "+ getPeso()+" kg");
        System.out.println("Situação: "+ getSituacao());
        System.out.println("Recinto: "+ getRecinto());
    }
}
