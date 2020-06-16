package edu.sanmartin.EduSanMartin.model;

public class Grado {
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Grado(int nivel) {
        super();
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Grado [nivel=" + nivel + "]";
    }

    public Grado() {
        super();
    }

}