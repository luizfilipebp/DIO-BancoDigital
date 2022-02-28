package br.banco;

import br.banco.intefaces.AccountInterface;

import java.util.UUID;

public class Account implements AccountInterface {
    protected Agency agency;
    protected UUID number;
    protected double ballance;
    protected Client client;

    public Account(Agency agency, Client client, double ballance) {
        this.agency = agency;
        this.ballance = ballance;
        this.client = client;
        this.number = UUID.randomUUID();
    }

    public double getBallance() {
        return this.ballance;
    }

    @Override
    public void withdraw(Double value) {
        if (value > this.ballance){
            System.out.println( "Saldo insuficiente");
        }else{
            this.ballance -= value;
        }
    }

    @Override
    public void deposit(Double value) {
        this.ballance += value;
    }

    @Override
    public void transfer(Account destination, Double value) {
        if (value > this.ballance){
            System.out.println("Saldo Insuficiente");
        }else{
            this.withdraw(value);
            destination.deposit(value);
            System.out.println("\nTransferencia realizada com sucesso\n");
        }
    }

    //
    public String getClientName(){
        return this.client.getName();
    }

    // imprirmir saldo
    public void printBallance(){
        System.out.printf("Olá %s\n", this.getClientName());
        System.out.printf("O saldo da sua conta é de R$%.2f\n", this.getBallance());
    }

}
