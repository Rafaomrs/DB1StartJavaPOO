package Testes;

import Classes.Aluno;
import Classes.Aula;
import Classes.Materia;
import Classes.Professor;
import Exceptions.CampoNaoPodeSerNulo;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class AulaTest {

    @Test
    public void deveJogarExceptionComDataNulo(){
        Date data = new Date();
        Professor professor = new Professor("fake@gmail.com", "fake");
        Materia materia = new Materia("POO", "fakefakefake", 10.5, 3, professor);
        List<Aluno> list = new ArrayList<>();
        try{
            Aula aula = new Aula(null, materia);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Data nao pode ser nulo", naoPodeSerNulo.getMessage());
        }

    }

    @Test
    public void deveJogarExceptionComMateriaNulo(){
        Professor professor = new Professor("fake@gmail.com", "fake");
        Date data = new Date();
        List<Aluno> list = new ArrayList<>();
        try{
            Aula aula = new Aula(data, null);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Matéria nao pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
//    @Test
//    public void deveJogarExceptionComListaAlunoNulo(){
//        Professor professor = new Professor("fake@gmail.com", "fake");
//        Materia materia = new Materia("POO", "fakefakefake", 10.5, 3, professor);
//        Date data = new Date();
//        try{
//            Aula aula = new Aula(data, materia, null);
//        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
//            Assert.assertEquals("Lista de alunos nao pode ser nulo", naoPodeSerNulo.getMessage());
//        }
//    }

    @Test
    public void deveCriarAulaPorMeioDeUmConstrutor(){
        Date data = new Date();
        Professor professor = new Professor("fake@dake.com", "ProfessorFake");
        Materia materia = new Materia("POO", "fakefakefake", 10.5, 3, professor);
        List<Aluno> list = new ArrayList<>();
        Aula aula = new Aula(data, materia);
        Assert.assertEquals(data, aula.getData());
        Assert.assertEquals(materia, aula.getMateria());
        Assert.assertEquals(list, aula.getAlunos());
    }
}
