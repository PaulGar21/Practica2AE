
package com.example.demo.repository;

import com.example.demo.model.Profesor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProfesorRepository extends JpaRepository <Profesor, Integer> {
List<Profesor> findByApellido(String apellido);
List<Profesor> findByEdadGreaterThan(int edad);
List<Profesor> findBySueldoLessThan(Float sueldo);
}
