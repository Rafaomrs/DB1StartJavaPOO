package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

    @Test
    public void deveCriarUmaMateriaPorMeioDoConstrutor(){
        String nome = "fake";
        String desc = "fake, fake, fake, fake";
        Double cargaHoraria = 10.5;
        Integer quantHorasAula = 3;
        Professor professor = new Professor("professor1", "fake@gmail.com");
        Materia materia = new Materia(nome, desc, cargaHoraria, quantHorasAula, professor);
        Assert.assertEquals(nome, materia.getNome());
        Assert.assertEquals(desc, materia.getDescricao());
        Assert.assertEquals(cargaHoraria, materia.getCargaHoraria());
        Assert.assertEquals(quantHorasAula, materia.getQuantidadedeAulas());
        Assert.assertEquals(professor, materia.getProfessor());
    }
}
