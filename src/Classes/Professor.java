package Classes;

import Classes.Pessoa;

public class Professor extends Pessoa {
    public Double salario;

    //CONTRUTOR
    public Professor(String email, String nome) {
        super(nome, email);
    }
}
