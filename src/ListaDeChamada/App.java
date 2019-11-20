package ListaDeChamada;

import Classes.Aluno;
import Classes.Aula;
import Classes.Materia;
import Classes.Professor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //CRIANDO ALUNO 1
        Aluno aluno1 = new Aluno("Maiko Cunha",
                "maiko.cunha@db1.com.br");
        //CRIANDO ALUNO 2
        Aluno aluno2 = new Aluno("Joao Silva",
                "joao.silva@db1.com.br");
        //CRIANDO PROFESSOR
        Professor professor = new Professor("Igor Silva",
                "igor.silva@db1.com.br");

        //CRIANDO MATERIA
        Materia materia = new Materia("POO",
                "Abstacao, Encapsulamento, Heranca, Polimorfismo",
                10.5,
                3, professor);

        //CRIANDO AULA

        Date data  = new Date();
        List<Aluno> listAluno = new ArrayList<Aluno>();
        listAluno.add(aluno1);
        listAluno.add(aluno2);
        Aula aula = new Aula(data, materia);

        System.out.println(aula);
    }
}
