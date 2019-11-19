package ListaDeChamada;

import org.junit.Assert;
import org.junit.Test;

public class AlunoTeste {


    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){
        String email = "maiko.cunha@db1.com.br";
        String nome = "Maiko Cunha";
        Aluno aluno = new Aluno(nome, email);
        Assert.assertEquals(nome, aluno.getNome());
        Assert.assertEquals(email, aluno.getEmail());
    }
}
