package edu.sanmartin.EduSanMartin.model;

public class Alumno extends Persona {
    private int grado;

    public Alumno(int idPersona, int dniPersona, String nombres, String apellidoP, String apellidoM, String genero,
            String rol, int grado) {
        super(idPersona, dniPersona, nombres, apellidoP, apellidoM, genero, rol);
        this.grado = grado;
    }

    public Alumno() {
        super();
    }

    @Override
    public String toString() {
        return "Alumno [grado=" + grado + "]";
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
    

}