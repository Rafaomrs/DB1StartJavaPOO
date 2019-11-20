package Testes;

import Classes.Professor;
import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {

    @Test
    public void deveCriarUmProfessorPorMeioDoConstrutor(){
        String nome = "Igor Silva";
        String email = "igor.silva@db1.com.br";
        Professor professor = new Professor(nome, email);
        Assert.assertEquals(nome, professor.getNome());
        Assert.assertEquals(email, professor.getEmail());
    }
}
