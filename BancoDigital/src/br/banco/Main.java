package br.banco;

public class Main {

    public static void main(String[] args) {
        // Criando um banco
        Bank oneBank = new Bank("oneBank");

        // Criando uma agencia
        Agency oneAgencie = oneBank.createAgency("norte", "agencia_norte");

        // Criando um cliente
        Client carlos = new Client("carlos", "adress");
        Client ana = new Client("ana", "endereco");

        // Criando uma conta para o cliente
        Account accountCarlos = oneAgencie.createAccount(carlos, 2d);
        Account accountAna = oneAgencie.createAccount(ana, 2000d);

        // mosta saldo
        accountCarlos.printBallance();
        accountAna.printBallance();


        // realizando transações
        accountAna.transfer(accountCarlos, 100d);

        // verficando saldo
        accountCarlos.printBallance();
        accountAna.printBallance();

        // listando os cliente de uma agencia
        oneAgencie.printCustomers();

        // sacando dinheiro
        accountAna.withdraw(1000d);
        accountAna.printBallance();
        accountAna.withdraw(5000d);
    }
}
