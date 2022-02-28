package br.banco;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private static final List<Agency> AGENCIES = new ArrayList<>();

    //contrutor
    public Bank(String name) {
        this.name = name;
    }

    // Criar uma agencia
    public Agency createAgency(String name, String adress){
        Agency agency = new Agency(adress, name);
        AGENCIES.add(agency);
        return agency;
    }

    // Listar as agencias do banco
    protected List<Agency> listAgency(){
        return AGENCIES;
    }

}
