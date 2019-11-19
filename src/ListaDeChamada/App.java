package ListaDeChamada;

import java.util.ArrayList;
import java.util.Date;

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
        Aula aula = new Aula();
        aula.data = new Date();
        aula.materia = materia;
        aula.alunos = new ArrayList<Aluno>();
        aula.alunos.add(aluno1);
        aula.alunos.add(aluno2);


        System.out.println(aula);


        System.out.println(aula);
    }
}
