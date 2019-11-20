package Classes;

import Exceptions.CampoNaoPodeSerNulo;

public abstract class Pessoa {

    private String nome;
    private String email;

    //CONSTRUTOR
    public Pessoa(String email, String nome){
        if (email == null){
            throw new CampoNaoPodeSerNulo("Email nao pode ser nulo");
        }
        if (nome == null){
            throw new CampoNaoPodeSerNulo("Nome nao pode ser nulo");
        }
        this.nome = nome;
        this.email = email;
    }

    public Pessoa() {

    }


    //METODO PARA PEGAR EMAIL PARA O TEST
    public String getNome(){
        return nome;
    }

    //============================================================================================================
    //NÃO PRECISA CRIAR DNV PARA FAZER O PROFESSORTEST (NESSE CONTEXTO) POIS AMBOS ESTAO BUSCANDO NA CLASSE PESSOA.
    //============================================================================================================

    //METODO PARA PEGAR NOME PARA TEST
    public String getEmail(){
        return email;
    }
    //ENFILEIRADOR DE STRINGS
    @Override
    public String toString() {
        return email +  " - " + nome;
    }
}
