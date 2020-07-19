package edu.sanmartin.EduSanMartin.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import edu.sanmartin.EduSanMartin.model.Persona;

@Mapper

public interface PersonaMapper {
    public List<Persona> listPersonas();
    public Persona personaByID(int id);
    public int nuevoIdPersona();
    public int insertarPersona(Persona persona );
    public int actualizarPersona(Persona persona);
    
}