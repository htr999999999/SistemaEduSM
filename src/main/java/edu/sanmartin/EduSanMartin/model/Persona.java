package edu.sanmartin.EduSanMartin.model;

import java.util.Date;

public class Persona {
    private int idPersona;
    private int dniPersona;
    private String nombres;
    private String apellidoP;
    private String apellidoM;
    private Date fechaNacimiento;
    private String genero;
    private String rol;

    public Persona(int idPersona, int dniPersona, String nombres, String apellidoP, String apellidoM,
            Date fechaNacimiento, String genero, String rol) { super();
        this.idPersona = idPersona;
        this.dniPersona = dniPersona;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.rol = rol;
    }

    public Persona(int idPersona, int dniPersona, String nombres, String apellidoP, String apellidoM, String genero,
            String rol) {
        this.idPersona = idPersona;
        this.dniPersona = dniPersona;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.genero = genero;
        this.rol = rol;
    }

    public Persona() {
        super();
    }

    public Persona(String nombres) {
        super();
        this.nombres = nombres;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(int dniPersona) {
        this.dniPersona = dniPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}