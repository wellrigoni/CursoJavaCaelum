/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.contas.modelo;

import br.com.caelum.contas.cliente.Cliente;

/**
 *
 * @author Well
 */
public class contaCorrente {
    private int conta;
    private Cliente titular;
    private double saldo;
    private double limite;
    private static int totalDeContas;

    public contaCorrente(int conta, Cliente titular, double saldo, double limite) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
        this.limite =limite;
        contaCorrente.totalDeContas ++;
    }
    
    public static int getTotalDeContas() {
        return contaCorrente.totalDeContas;
    }
    

    /**
     * @return the conta
     */
    public int getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(int conta) {
        this.conta = conta;
    }

    /**
     * @return the titular
     */
       
    

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public boolean deposito(double valorDeposito){
        if(valorDeposito >=0){
        this.saldo += valorDeposito;
        return true;
        }else
        return false;
    }
    
    public boolean saque(double valorSaque){
        if(this.saldo > valorSaque){
            this.saldo -= valorSaque;
        return true;   
        }else{
            return false;
        }
    }
    
    public void transfere(contaCorrente conta, double valor){
       boolean sacou = this.saque(valor);
       if(sacou){
           conta.deposito(valor);
       }else
            System.out.println("erro");
    }

    @Override
    public String toString() {
        return "Conta:" +this.conta+ "\nTitular: " +this.titular.getNome() +"\nCPF:" +this.titular.getCpf() +"\nSaldo:" +this.saldo; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
