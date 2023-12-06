
package com.example.demo.controller;

import com.example.demo.model.Profesor;
import com.example.demo.services.ProfesorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping ("/api/v1")
public class ProfesorController {
    @Autowired
	private ProfesorService servicio;

	//metodo GET para listar productos
	
	@GetMapping("/profesores")
	public List<Profesor> listarProfesor()
	{
		return servicio.listarProfesor();
	}	
	@GetMapping("/profesor/{id}")
	public ResponseEntity<Profesor> obtenerProfesorporID (@PathVariable Integer id )
	{
            try{
                Profesor profesor = servicio.obtenerProfesorporID(id);
                return new ResponseEntity<Profesor>(profesor, HttpStatus.OK);
            }
            catch(Exception e)
            {
                return new ResponseEntity<Profesor>(HttpStatus.NOT_FOUND);
                
                 }
            }
		
	//metodo para guardar profesores.
	@PostMapping("/profesores")
	public Profesor guardarProfesor(@RequestBody Profesor profesor) 
	{
		servicio.guardarProfesor(profesor);
		return profesor;
	}
	
	//borrar profesor.
	@DeleteMapping("/profesores/{id}")
	public void eliminarProfesor (@PathVariable Integer id)
	{
		servicio.eliminarProfesor(id);
						
	}
	//actualizar profesor. 
	@PutMapping("/profesores/{id}")
	public Profesor actualizarProfesor (@RequestBody Profesor profesor, @PathVariable Integer id)
	{
		servicio.guardarProfesor(profesor);
		Profesor profesorExistente = servicio.obtenerProfesorporID(id);
		return profesorExistente;
		
	}
	
        //buscar por apelldio. 
        @GetMapping("/profesores/apellido/{apellido}")
        public List <Profesor> listarProfesorPorApellido (@PathVariable String apellido){
           return servicio.listarProfesorporApellido(apellido);
        }
        //buscar por edad. 
        @GetMapping("profesores/edad/{edad}")
        public List<Profesor> listarPorEdad(@PathVariable int edad){
        return servicio.listarProfesorPorEdadMayor(edad);
        }
        //buscar por sueldo. 
        @GetMapping("profesores/sueldo/{sueldo}")
        public List<Profesor> listarPorSueldo(@PathVariable Float sueldo){
        return servicio.listarProfesorPorSueldoMenor(sueldo);
        }
}
