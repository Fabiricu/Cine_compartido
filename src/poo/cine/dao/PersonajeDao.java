/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;
import poo.cine.Personaje;

/**
 *
 * @author Alumno
 */
public interface PersonajeDao {

    public Personaje buscarPorPersonaje (String nombreEnPelicula);
    
    public void guardar (Personaje personaje);
}
