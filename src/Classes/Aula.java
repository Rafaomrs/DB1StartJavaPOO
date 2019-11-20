package Classes;

import Exceptions.CampoNaoPodeSerNulo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {
    private Date data;
    private Materia materia;
    private List<Aluno> alunos = new ArrayList<Aluno>();


    public Aula(Date data, Materia materia) {
        if (data == null){
            throw new CampoNaoPodeSerNulo("Data nao pode ser nulo");
        }
        if (materia == null){
            throw new CampoNaoPodeSerNulo("Matéria nao pode ser nulo");
        }
        this.data = data;
        this.materia = materia;
    }

    public void darPresenca(Aluno aluno){
        if (aluno == null){
            throw new CampoNaoPodeSerNulo("Aluno nao pode ser nulo");
        }
        this.alunos.add(aluno);
    }

    public int quantidadeDeAlunosPresentes(){
        return this.alunos.size();
    }
    public void trocarProfessor(Professor professor) {
        this.materia.setProfessor(professor);
    }


    public Date getData(){
        return data;
    }
    public Materia getMateria(){
        return materia;
    }
    public List<Aluno> getAlunos(){
        return alunos;
    }

    //SOBESCREVENDO O METODO CLASSE SUPERIOR - TOSTRING
    @Override
    public String toString(){
        return "date " + data +
                ", \nmateria " + materia +
                ", \nlista de alunos " + alunos;
    }
}
