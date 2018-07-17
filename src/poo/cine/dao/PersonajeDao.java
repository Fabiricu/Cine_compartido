/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;
import java.util.List;
import poo.cine.Personaje;

/**
 *
 * @author Alumno
 */
public interface PersonajeDao {

    public Personaje buscarPorNombre (String nombreEnPelicula);
    
    public void guardar (Personaje personaje);
    
    public List<Personaje> obtenerTodos();

}
