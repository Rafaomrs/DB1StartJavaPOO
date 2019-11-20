package Testes;

import Classes.Aluno;
import Classes.Aula;
import Classes.Materia;
import Classes.Professor;
import Exceptions.CampoNaoPodeSerNulo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class AlunoTeste {

    @Test
    public void deveAdicionarAlunoNaChamada(){
        String nome = "Maiko Cunha";
        String email = "maiko.cunha@db1.com.br";
        Aluno aluno = new Aluno(email, nome);
        Professor professor = new Professor("maiko.cunha@db1.com.br", "Maiko Cunha");
        Materia materia = new Materia("POO", "fakefakefake", 10.5, 3, professor);
        Date data = new Date();
        Aula aula = new Aula(data, materia);

        Assert.assertEquals(0, aula.getAlunos().size());
        aula.darPresenca(aluno);
        Assert.assertEquals(1, aula.getAlunos().size());

//        Assert.assertEquals(0, aula.quantidadeDeAlunosPresentes());

        Assert.assertEquals(1, aula.quantidadeDeAlunosPresentes());
    }


    @Test
    public void deveJogarExceptionComEmailNulo(){
        String nome = "fake";
        try{
            Aluno aluno = new Aluno(null, nome);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Email nao pode ser nulo", naoPodeSerNulo.getMessage());
        }

    }
    @Test
    public void deveJogarExceptionComNomeNulo(){
        String email = "fake@gmail.com";
        try{
            Aluno aluno = new Aluno(email, null);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome nao pode ser nulo", naoPodeSerNulo.getMessage());
        }

    }

    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){
        String nome = "Maiko Cunha";
        String email = "maiko.cunha@db1.com.br";
        Aluno aluno = new Aluno(email, nome);
        Assert.assertEquals(nome, aluno.getNome());
        Assert.assertEquals(email, aluno.getEmail());
    }

}
