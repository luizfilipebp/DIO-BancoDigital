package br.banco;

public class Client {
    private String name;
    private String adress;


    public Client(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }


    public String getName() {return this.name;}

    public void setName(String nome) {
        this.name = nome;
    }

}
