package ListaDeChamada;

public class Aluno extends Pessoa{
    public Double nota;

    //CONTRUTOR
    public Aluno(String email, String nome){
        super(nome, email);
    }

    //ENFILEIRADOR DE STRING
    @Override
    public String toString(){
        return super.toString() +  "Aluno \n" +
                " Nota \n" + nota;
    }
}
