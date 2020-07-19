package edu.sanmartin.EduSanMartin.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpersona;
    private int dnipersona;
    private String nombres;
    private String apellidop;
    private String apellidom;
    private Date fechanacimiento;
    private String genero;
    private String rol;

    public Persona(int idPersona, int dniPersona, String nombres, String apellidoP, String apellidoM,
            Date fechaNacimiento, String genero, String rol) { super();
        this.idpersona = idPersona;
        this.dnipersona = dniPersona;
        this.nombres = nombres;
        this.apellidop = apellidoP;
        this.apellidom = apellidoM;
        this.fechanacimiento = fechaNacimiento;
        this.genero = genero;
        this.rol = rol;
    }

    public Persona(int idPersona, int dniPersona, String nombres, String apellidoP, String apellidoM, String genero,
            String rol) {
        this.idpersona = idPersona;
        this.dnipersona = dniPersona;
        this.nombres = nombres;
        this.apellidop = apellidoP;
        this.apellidom = apellidoM;
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
        return idpersona;
    }

    public void setIdPersona(int idPersona) {
        this.idpersona = idPersona;
    }

    public int getDniPersona() {
        return dnipersona;
    }

    public void setDniPersona(int dniPersona) {
        this.dnipersona = dniPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoP() {
        return apellidop;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidop = apellidoP;
    }

    public String getApellidoM() {
        return apellidom;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidom = apellidoM;
    }

    public Date getFechaNacimiento() {
        return fechanacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechanacimiento = fechaNacimiento;
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