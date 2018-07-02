/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.controller;

import org.hibernate.SessionFactory;
import poo.cine.Personaje;
import poo.cine.dao.PersonajeDao;
import poo.cine.dao.PersonajeDaoHibernateImpl;
import poo.cine.ui.PantallaAdministracionPersonajes;

/**
 *
 * @author Alumno
 */
public class GestorPersonaje {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author joaquinleonelrobles
 */
  
    
    private final PersonajeDao personajeDao;


    public GestorPersonaje (SessionFactory sessionFactory) {
               
        // creamos las instancias de los objetos de acceso a datos
        this.personajeDao = new PersonajeDaoHibernateImpl(sessionFactory);

    }
    
    public void run () {
                        
        // creamos una instancia del formulario y lo mostramos
        PantallaAdministracionPersonajes panelpersonajes = new PantallaAdministracionPersonajes(this);
        panelpersonajes.setVisible(true);
    }
    
    public Personaje buscarPersonajePorPersonaje(String nombreEnPelicula) {
        return PersonajeDao.buscarPorPersonaje(nombreEnPelicula);
    }
    
    public void guardarPersonaje(Personaje personaje) {
        personajeDao.guardar(personaje);
    }
}