package com.boot.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.boot.model.Boots;

public class BootsUtil {
private static SessionFactory sessionFactory = null;
public static SessionFactory getSessionFactory()
{
	return new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Boots.class)
			.buildSessionFactory();
}
}
