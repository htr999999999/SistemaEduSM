package edu.sanmartin.EduSanMartin.model;

public class Usuario extends Alumno{
    private String username;
    private String passwrd;

    public Usuario() {
        super();
    }

    public Usuario(int idPersona, int dniPersona, String nombres, String apellidoP, String apellidoM, String genero,
            String rol, Grado grado) {
        super(idPersona, dniPersona, nombres, apellidoP, apellidoM, genero, rol, grado);
    }

    public Usuario(String username, String passwrd) {
        super();
        this.username = username;
        this.passwrd = passwrd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    @Override
    public String toString() {
        return "Usuario [passwrd=" + passwrd + ", username=" + username + "]";
    }
}