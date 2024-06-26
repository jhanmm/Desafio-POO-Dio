package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n\n        Curso" +
                "\n" + getTitulo() +
                "\n" + getDescricao() +
                "\nCarga Horaria:" + cargaHoraria + "\n";
    }
}
