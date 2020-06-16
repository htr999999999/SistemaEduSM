package edu.sanmartin.EduSanMartin.model;

public class Alumno extends Persona {
    private Grado grado;

    public Alumno(int idPersona, int dniPersona, String nombres, String apellidoP, String apellidoM, String genero,
            String rol, Grado grado) {
        super(idPersona, dniPersona, nombres, apellidoP, apellidoM, genero, rol);
        this.grado = grado;
    }

    public Alumno() {
        super();
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Alumno [grado=" + grado + "]";
    }
    
    

}