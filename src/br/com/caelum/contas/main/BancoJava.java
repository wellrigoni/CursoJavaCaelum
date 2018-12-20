/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.contas.main;
import br.com.caelum.contas.cliente.Cliente;
import br.com.caelum.contas.modelo.contaCorrente;
import java.util.Scanner;


/**
 *
 * @author Well
 */
public class BancoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Cliente cli1 = new Cliente("well", "rj", "2121343434");
        Cliente cli2 = new Cliente("paulo", "rj", "999999999434");

        
        contaCorrente conta01 = new contaCorrente(01, cli1, 50,10);
        contaCorrente conta02 = new contaCorrente(02, cli2, 50,10);
        int opcao = 1;
        while(opcao != 0 ){
            
         System.out.println("1- Deposito");
         System.out.println("2- Saldo");
         System.out.println("3- Saque");
         System.out.println("4- Imprime");
         System.out.println("5- Transfere");
         System.out.println("0- Sair");
         System.out.println("Digite a opcao:");
            opcao = input.nextInt(); 
            switch(opcao){
                case 1:
                    System.out.println("Digite o valor do deposito:");
                    conta01.deposito(input.nextInt()); 
                    break;
                case 2:
                    System.out.println("Saldo c1: "+conta01.getSaldo() );
                    System.out.println("Saldo c2: "+conta02.getSaldo() );
                    break;
                case 3:
                    System.out.println("Digite o valor do saque:");
                    conta01.saque(input.nextInt());
                    break;
                case 4:
                    System.out.println(conta01.toString());
                    break;
                case 5:
                    System.out.println("Digite o valor da Transferencia:");
                    conta01.transfere(conta02, input.nextInt());
                    break;
                         }           
            
        }  
        
    }
    
}
