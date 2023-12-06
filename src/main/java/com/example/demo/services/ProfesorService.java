
package com.example.demo.services;

import com.example.demo.model.Profesor;
import com.example.demo.repository.ProfesorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService {
    
	@Autowired
	private ProfesorRepository repositorio;
	
	//metodo para listar productos
	public List<Profesor> listarProfesor()
	{
		return repositorio.findAll();
	
	}
	
	//metodo para guardar productos
	public void guardarProfesor (Profesor profesor)
	{
		repositorio.save(profesor);		
	}
	
	//obtener un producto por el ID
	public Profesor obtenerProfesorporID (Integer id) 
	{
		return repositorio.findById(id).get();
	}
	
	//eliminar producto
	
	public void eliminarProfesor(Integer id)
	{
		
		repositorio.deleteById(id);
	}
        public List<Profesor> listarProfesorporApellido (String apellido)
        {
             return repositorio.findByApellido(apellido);
        }
        public List<Profesor> listarProfesorPorEdadMayor (int edad){
        return repositorio.findByEdadGreaterThan(edad);
        }
        public List<Profesor> listarProfesorPorSueldoMenor (Float sueldo){
        return repositorio.findBySueldoLessThan(sueldo);
        }
}
