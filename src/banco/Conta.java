
package banco;

import java.util.Random;
import javax.sound.midi.Soundbank;

public class Conta {

    public Conta(Pessoa titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.numConta = this.gerarNum();
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private int numConta;
    private Pessoa titular;
    private double saldo;
    
    public static void main(String[] args) {
    }

    private int gerarNum() {
        Random random = new Random();
        
        return random.nextInt(90000) + 10000;
    }
    
    public void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
            System.out.printf("Saldo após depósisto: R$%.2ff", this.saldo);
        }else{
            System.out.println("O valor é inválidooo!");
        }
    }
    
    public void sacar(double valor){
        if(valor <= saldo && valor > 0){
            this.saldo -= valor;
             System.out.printf("Saldo após saque: R$%.2ff", this.saldo);
        }else{
            System.out.println("Valor inválido ou insuficiente para saque");
        }
    }
    
}
