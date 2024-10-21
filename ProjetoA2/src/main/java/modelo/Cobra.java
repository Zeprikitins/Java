
package modelo;

import java.util.Date;


public class Cobra extends Animal{
    private Boolean peconha;
    private String especie;

    public Cobra(Boolean peconha, String especie, int identificador, String nome, Date dataNascimento, char sexo, String tamanho, double peso, String situacao, String recinto) {
        super(identificador, nome, dataNascimento, sexo, tamanho, peso, situacao, recinto);
        this.peconha = peconha;
        this.especie = especie;
    }
    
    
    
    public void imprimir(){
        System.out.println("Cobra:");
        System.out.println("Identificador: "+ getIdentificador());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: "+ calcularIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Tamanho: "+ getTamanho());
        System.out.println("Peso: "+ getPeso()+" kg");
        System.out.println("Situação: "+ getSituacao());
        System.out.println("Recinto: "+ getRecinto());
        System.out.println("Tem Peçonha: "+ getPeconha());
        System.out.println("Espécie: "+ getEspecie());
        
    };

    public Boolean getPeconha() {
        return peconha;
    }

    public void setPeconha(Boolean peconha) {
            this.peconha = peconha;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    
}
