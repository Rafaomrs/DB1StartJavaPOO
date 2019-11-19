package ListaDeChamada;

public abstract class Pessoa {

    private String nome;
    private String email;

    //CONSTRUTOR
    public Pessoa(String email, String nome){
        this.nome = nome;
        this.email = email;
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
