package Classes;

public class Aluno extends Pessoa {
    public Double nota;

    //CONTRUTOR
    public Aluno(String email, String nome){
        super(email, nome);
    }

    public Aluno() {
        super();
    }

    //ENFILEIRADOR DE STRING
    @Override
    public String toString(){
        return super.toString() +  "Aluno \n" +
                " Nota \n" + nota;
    }
}
