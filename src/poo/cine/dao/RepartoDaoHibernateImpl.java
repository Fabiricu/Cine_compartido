/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;
import poo.cine.Personaje;
/**
 *
 * @author Andrew
 */
public class RepartoDaoHibernateImpl implements RepartoDao {
    
    public List<Personaje> obtenerReparto(SessionFactory sessionFactory){
         Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Reparto> query = builder.createQuery(Pelicula.class);
        Root<R> root = query.from(Pelicula.class);
        query.select(root);
        query.where(builder.equal(root.get("nombre"), nombre));
        
        Pelicula pelicula = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return pelicula;
 
        List<Genero> retorno = session.createQuery("from Genero").list();
}
    
}
