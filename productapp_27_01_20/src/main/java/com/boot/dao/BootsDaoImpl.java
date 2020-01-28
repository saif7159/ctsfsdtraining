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
		return query.getResultList();
		
	}
	@Override
	public List<Boots> allBoots() {
		manager.getTransaction().begin();
		Query query = manager.createQuery("From Boots");
		return query.getResultList();
		
	}

}
