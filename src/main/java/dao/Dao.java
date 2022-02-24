package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Dao<OB> {
public void save(OB objeto) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("escola");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	em.merge(objeto);
	em.getTransaction().commit();
	
	
	}
}
