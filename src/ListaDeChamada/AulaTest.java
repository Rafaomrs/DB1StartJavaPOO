package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class AulaTest {

    @Test
    public void deveCriarAulaPorMeioDeUmConstrutor(){
        Date data = new Date();
        Professor professor = new Professor("fake@dake.com", "ProfessorFake");
        Materia materia = new Materia("POO", "fakefakefake", 10.5, 3, professor);
        List<Aluno> list = new ArrayList<>();
        Aula aula = new Aula(data, professor, materia, list);
        Assert.assertEquals(data, aula.getData());
        Assert.assertEquals(materia, aula.getMateria());
        Assert.assertEquals(list, aula.getAlunos());
    }
}
