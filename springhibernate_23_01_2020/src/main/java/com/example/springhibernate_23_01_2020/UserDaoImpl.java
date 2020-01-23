package com.example.springhibernate_23_01_2020;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
 private SessionFactory factory;
 private Session session;
 public UserDaoImpl(SessionFactory factory) {
 this.factory = factory;
 session = factory.openSession();
}
	@Override
	public UserDetail createUser(UserDetail detail) {

		session.save(detail);
		return detail;
	}

}
