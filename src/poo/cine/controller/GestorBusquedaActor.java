/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.controller;

import java.util.List;
import org.hibernate.SessionFactory;
import poo.cine.Actor;
import poo.cine.dao.ActorDao;
import poo.cine.dao.ActorDaoHibernateImpl;
import poo.cine.ui.PantallaBusquedaActores;
import poo.cine.controller.GestorActor;
/**
 *
 * @author Andrew
 */
 



public class GestorBusquedaActor {
    
    
 private final ActorDao actorDao;
 private final GestorActor gactor;
  
 public GestorBusquedaActor (SessionFactory sessionFactory){
     
  this.actorDao = new ActorDaoHibernateImpl(sessionFactory);
  this.gactor = new GestorActor(sessionFactory);
 }
  
  public void run () {
                        
        // creamos una instancia del formulario y lo mostramos
        List<Actor> actores = actorDao.obtenerTodos();
        PantallaBusquedaActores pbactores = new PantallaBusquedaActores(this,actores);
        pbactores.setVisible(true);
    }
 
  public void gestorActor(){
      
      gactor.run();
  }
  
  
 /*
    private void campoBuscadorReleased(){
    resultado.setText("");
    String cadenaResultados = "";
            
    
        for(int=0;i <listado.size();i++){
            if(listado.get(i).empiezaPor(campoBusqueda.getText())){
              cadenaResultados += listado.get(i).toString + "/n/n";
             }
    
         resultado.setText(cadenaResultados):
        }
    }
   */ 
  
   /*
    private List<Actor> resultado;
    private void campoBuscadorReleased(){
    resultado = null;
    String cadenaResultados = "";
            
    
        for(int=0;i <acotres.size();i++){
            if(actores.get(i).empiezaPor(campoBusqueda.getText())){
              cadenaResultados += listado.get(i).toString + "/n/n";
             }
    
         resultado.setText(cadenaResultados):
        }
    }
   */ 
 /*
    private boolean empiezaPor(String apellido, String campo){
        if(campo.isEmpty()|| campo.length()<apellido.length()){
        return false;
        }
        for (i=0;i<campo.lenght();i++){
            if(campo.charAt(i)!= apellido.charAt(i)){
            return false;
            }
        }  
        return true;
    }
 */
}
