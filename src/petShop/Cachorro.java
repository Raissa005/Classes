
package semana04;

import java.util.ArrayList;

public class Cachorro {

    public Cachorro(String nome, String raca, Integer idade, String porte,  Dono dono){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
        this.Dono = Dono;
    }
 
    private String nome; 
    private String raca;
    private Integer idade;
    private String porte;
    private String Dono;

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public static void main(String[] args){
        ArrayList<Cachorro> listaDogs = new ArrayList<>();
        
        Dono dono1 = new Dono("Roger", "9999-9999", "Endereço taal");
        
        Cachorro cachorroUm = new Cachorro("Bob", "Labrador",  4, "Médio", dono1);
        Cachorro cachorro2 = new Cachorro("Nic", "Husk", 8, "Médio", dono1);
        listaDogs.add(cachorro2);
        
        for(Cachorro dog : listaDogs){
            System.out.println(dog.getNome());
        }
        
        
        System.out.println(cachorroUm.Dono);
        System.out.println(cachorroUm.getNome());
    }
}
