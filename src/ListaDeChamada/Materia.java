package ListaDeChamada;

public class Materia {

    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Integer quantidadedeAulas;
    public Professor professor;


    public Materia(String nome, String descricao, Double cargaHoraria, Integer quantidadedeAulas, Professor professor){
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.quantidadedeAulas = quantidadedeAulas;
        this.professor = professor;
    }
    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public Double getCargaHoraria(){
        return cargaHoraria;
    }
    public Integer getQuantidadedeAulas(){
        return quantidadedeAulas;
    }
    public Professor getProfessor(){
        return professor;
    }


    //ENFILEIRADOR DE STRINGS
    @Override
    public String toString(){
        return "nome " + nome +
                ", \ndescrisao " + descricao +
                ", \ncarga horaria " + cargaHoraria +
                ", \nquantidade de aula " + quantidadedeAulas +
                ", \nprofessor - " + professor;
    }
}
