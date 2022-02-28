package br.banco.intefaces;

import br.banco.Account;

public interface AccountInterface {
    void withdraw(Double valor);

    void deposit(Double valor);

    void transfer(Account accountDestino, Double valor);

}
