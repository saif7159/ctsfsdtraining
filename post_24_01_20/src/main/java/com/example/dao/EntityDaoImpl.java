package com.example.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.model.Comment;
import com.example.model.Post;
@Repository("dao")
public class EntityDaoImpl implements EntityDao {
private SessionFactory sessionFactory;
private Session session;
	
	public EntityDaoImpl(SessionFactory sessionFactory) {
	super();
	this.sessionFactory = sessionFactory;
	session = sessionFactory.openSession();
}
	

	@Override
	@Transactional
	public Post createPost(Post p ) {
		
		session.getTransaction().begin();
		session.save(p);
		session.getTransaction().commit();
		return p;
	}

}
