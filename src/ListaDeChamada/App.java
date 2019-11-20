package ListaDeChamada;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //colocando aluno 1
        Aluno aluno1 = new Aluno("Maiko Cunha", "maiko.cunha@db1.com.br");
        //colocando aluno 2
        Aluno aluno2 = new Aluno("Joao Silva", "joao.silva@db1.com.br");
        //colcoando professor
        Professor professor = new Professor("Igor Silva", "igor.silva@db1.com.br");

        //criando materia      //CRIAR CONSTRUTOR E TESTAR
        Materia materia = new Materia("POO",
                "Abstacao, Encapsulamento, Heranca, Polimorfismo",
                10.5,
                3, professor);

        //criando aula        //CRIAR CONSTRUTOR E TESTAR

        Date data  = new Date();
        List<Aluno> listAluno = new ArrayList<Aluno>();
        Aula aula = new Aula(data, materia, listAluno);

        System.out.println(aula);


        System.out.println(aula);
    }
}
