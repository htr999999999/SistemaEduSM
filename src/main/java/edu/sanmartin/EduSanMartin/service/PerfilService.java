package edu.sanmartin.EduSanMartin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.sanmartin.EduSanMartin.model.Alumno;
@Service

public interface PerfilService {
    public List<Alumno> lAlumnos();
    public Alumno alumnobyID(int id);
    public int nuevoAlu();
    
}