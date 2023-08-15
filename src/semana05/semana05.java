
package semana05;

import java.util.ArrayList;
import banco.Pessoa;
import banco.Conta;

public class semana05 {
    public static void main(String[] args){
        ArrayList<Conta> banco = new ArrayList<>();
        
        Pessoa pessoa1 = new Pessoa("Gustavo", "9999-9999");
        Pessoa pessoa2 = new Pessoa("Marçaneiro", "88888-8888");
        Pessoa pessoa3 = new Pessoa ("Felipe", "77777-7777");
        
        banco.add(new Conta(pessoa1));
        banco.add(new Conta(pessoa2));
       banco.add(new Conta(pessoa3));
       banco.get(0).depositar(1000.0);
       
       for(Conta conta: banco){
           System.out.println(conta.getTitular().getNome());
           conta.depositar(100.0);

       }
      }
}
