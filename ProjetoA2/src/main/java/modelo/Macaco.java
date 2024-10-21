
package modelo;

import java.util.Date;

public class Macaco extends Animal{
   private String especie;

   public void imprimir(){
        System.out.println("Macaco:");
        System.out.println("Identificador: "+ getIdentificador());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: "+ calcularIdade() );
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Tamanho: "+ getTamanho());
        System.out.println("Peso: "+ getPeso()+" kg");
        System.out.println("Situação: "+ getSituacao());
        System.out.println("Recinto: "+ getRecinto());
        System.out.println("Espécie: "+ getEspecie());
        
    };
   
    public Macaco(String especie, int identificador, String nome, Date dataNascimento, char sexo, String tamanho, double peso, String situacao, String recinto) {
        super(identificador, nome, dataNascimento, sexo, tamanho, peso, situacao, recinto);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
   
   
}
