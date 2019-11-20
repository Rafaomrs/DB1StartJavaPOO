package ListaDeChamada;

import java.util.Date;
import java.util.List;

public class Aula {
    private Date data;
    private Materia materia;
    private List<Aluno> alunos;


    public Aula(Date data, Materia materia, List<Aluno> listaluno) {
        this.data = data;
        this.materia = materia;
        this.alunos = listaluno;
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
