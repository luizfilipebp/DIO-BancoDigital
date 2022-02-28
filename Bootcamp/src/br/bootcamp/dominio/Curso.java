package br.bootcamp.dominio;

public class Curso extends  Conteudo{
    private int cargaHoraria; //

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    // Get e Set
    public int getCargaHoraria() {return cargaHoraria;}

    public void setCargaHoraria(int cargaHoraria) {this.cargaHoraria = cargaHoraria;}
    // toString

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}