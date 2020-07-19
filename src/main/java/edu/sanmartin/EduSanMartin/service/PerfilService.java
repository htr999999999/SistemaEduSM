package edu.sanmartin.EduSanMartin.service;

import java.util.List;

import edu.sanmartin.EduSanMartin.model.Alumno;


public interface PerfilService {
    public List<Alumno> lAlumnos();
    public Alumno alumnobyID(int idalumno);
    
}