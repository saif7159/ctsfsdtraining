package com.boot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;


import com.boot.model.Boots;
import com.boot.util.BootsUtil;

public class BootsDaoImpl implements BootsDao{
	private Session session = null;
	private EntityManager manager = null;
	{
		session = BootsUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		manager = session.getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
	}
	@Override
	public Boots createBoots(Boots boot) {
		manager.getTransaction().begin();
		manager.persist(boot);
		manager.getTransaction().commit();
		return boot;
	}
	@Override
	public List<Boots> fetchBoots(int size) {
		manager.getTransaction().begin();
		Query query = manager.createQuery("From Boots where size="+size);
		manager.getTransaction().commit();
		return query.getResultList();
		
	}
	@Override
	public List<Boots> allBoots() {
		manager.getTransaction().begin();
		Query query = manager.createQuery("From Boots");
		manager.getTransaction().commit();
		return query.getResultList();
		
	}
	@Override
	public Boots findById(int id) {
		
		manager.getTransaction().begin();
		Boots b = manager.find(Boots.class, id);
		manager.getTransaction().commit();
		return b;
		
	}
	@Override
	public Boots updateBoot(Boots b) {
		manager.getTransaction().begin();
		manager.merge(b);
		manager.getTransaction().commit();
		return b;
	}
	@Override
	public void deleteBoot(int id) {
		Boots b = findById(id);
		manager.getTransaction().begin();
		manager.remove(b);
		manager.getTransaction().commit();
		
	}

}
