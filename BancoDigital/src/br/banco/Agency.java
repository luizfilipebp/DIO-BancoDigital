package br.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Agency {
    private String name;
    private String adress;
    private UUID number;
    private List<Client> customers = new ArrayList<>();

    // Construtor
    public Agency(String adress, String name) {
        this.name = name;
        this.adress = adress;
        this.number = UUID.randomUUID();
    }

    // Abirir uma conta
    protected Account createAccount (Client client, double balance){
        this.customers.add(client);
        return new Account(this, client, balance);
    }

    // Imprimir os Clientes
    protected void printCustomers(){
        System.out.println("==== Clientes ====");
        for (Client c: customers) {
            System.out.println(c.getName());
        }
        System.out.println("==================");
    }

}
