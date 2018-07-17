/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.cine.Personaje;

/**
 *
 * @author Alumno
 */
public class PersonajeDaoHibernateImpl implements PersonajeDao{
    
    private final SessionFactory sessionFactory;

    public PersonajeDaoHibernateImpl(SessionFactory sessionFactory) {
        
        this.sessionFactory = sessionFactory;
    }
    
    

    @Override
    public Personaje buscarPorNombre(String nombre) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Personaje> query = builder.createQuery(Personaje.class);
        Root<Personaje> root = query.from(Personaje.class);
        query.select(root);
        query.where(builder.equal(root.get("nombre"), nombre));
        
        Personaje personaje = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return personaje;
    }

    @Override
    public void guardar(Personaje personaje) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(personaje);
        session.getTransaction().commit();
        session.close();
    }
    @Override
         public List<Personaje> obtenerTodos(){
                Session session = sessionFactory.openSession();
                List<Personaje> retorno = session.createQuery("from Personaje").list();
                session.close();
        
         return retorno;
    }
    
}
