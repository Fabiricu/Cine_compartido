/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.controller;

import org.hibernate.SessionFactory;
import poo.cine.Personaje;
import poo.cine.ui.PantallaBusquedaPersonajes;
import poo.cine.controller.GestorPersonaje;
import poo.cine.dao.PersonajeDao;
import poo.cine.dao.PersonajeDaoHibernateImpl;

/**
 *
 * @author Alumno
 */
public class GestorBusquedaPersonaje {
    
    private  PersonajeDao personajeDao;

    
     public GestorBusquedaPersonaje(SessionFactory sessionFactory) {
               
        // creamos las instancias de los objetos de acceso a datos
        this.personajeDao = new PersonajeDaoHibernateImpl(sessionFactory);
        

    }
    
    public void run () {
                        
        // creamos una instancia del formulario y lo mostramos
        PantallaBusquedaPersonajes panelpersonajes = new PantallaBusquedaPersonajes(this);
        panelpersonajes.setVisible(true);
    }
    
    /*public List<Personaje> obtenerElenco () {
        // mockup del resultado de la llamada al caso de uso "Registrar Elenco"
        Sexo masculino = new Sexo("Masculino");
        Actor ricardo = new Actor(false, "Darín", "Ricardo", masculino);
        Rol protagonista = new Rol("Protagonista");
        
        List<Personaje> personajes = new ArrayList<>();                
        personajes.add(new Personaje("Bombita", ricardo, protagonista));
        
        return personajes;
    }
*/
    public Personaje buscarPersonajePorNombre(String nombre) {
        return personajeDao.buscarPorNombre(nombre);
    }
    
    public void guardarActor(Personaje personaje) {
        personajeDao.guardar(personaje);
    }
}
    


    
}
