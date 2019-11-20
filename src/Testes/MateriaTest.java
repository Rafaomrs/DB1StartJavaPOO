package Testes;

import Exceptions.CampoNaoPodeSerNulo;
import Classes.Materia;
import Classes.Professor;
import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

    @Test
    public void deveJogarExceptionComNomeNulo(){
        String desc = "fake, fake, fake, fake";
        Double cargaHoraria = 10.5;
        Integer quantHorasAula = 3;
        Professor professor = new Professor("professor1", "fake@gmail.com");
        try{
            Materia materia = new Materia(null, desc, cargaHoraria, quantHorasAula, professor);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome nao pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveJogarExceptionComDescrisaoNulo(){
        String nome = "fake";
        Double cargaHoraria = 10.5;
        Integer quantHorasAula = 3;
        Professor professor = new Professor("professor1", "fake@gmail.com");
        try{
            Materia materia = new Materia(nome, null, cargaHoraria, quantHorasAula, professor);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Descrisao nao pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveJogarExceptionComCargaHorariaNulo(){
        String nome = "fake";
        String desc = "fake, fake, fake, fake";
        Integer quantHorasAula = 3;
        Professor professor = new Professor("professor1", "fake@gmail.com");
        try{
            Materia materia = new Materia(nome, desc, null, quantHorasAula, professor);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Carga Horaria nao pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveJogarExcpetionQuantidadeDeHoraNulo(){
        String nome = "fake";
        String desc = "fake, fake, fake, fake";
        Double cargaHoraria = 10.5;
        Professor professor = new Professor("professor1", "fake@gmail.com");
        try{
            Materia materia = new Materia(nome, desc, cargaHoraria, null, professor);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Quantidade de horas nao pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveJogarExceptionProfessorNulo(){
        String nome = "fake";
        String desc = "fake, fake, fake, fake";
        Double cargaHoraria = 10.5;
        Integer quantHorasAula = 3;
        try{
            Materia materia = new Materia(nome, desc, cargaHoraria, quantHorasAula, null);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Professor nao pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

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
