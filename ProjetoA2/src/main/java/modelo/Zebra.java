
package modelo;

import java.util.Date;

public class Zebra extends Animal{

    public Zebra(int identificador, String nome, Date dataNascimento, char sexo, String tamanho, double peso, String situacao, String recinto) {
        super(identificador, nome, dataNascimento, sexo, tamanho, peso, situacao, recinto);
    }
    
    
    public void imprimir(){
        System.out.println("Zebra: ");
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
