package com.image.hibernate.dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.image.hibernate.model.Album;
import com.image.hibernate.model.Photo;
import com.image.hibernate.sessionfactory.SessionCreator;

public class AlbumDaoImpl implements AlbumDao{
	Session session = null;
	{
		session = SessionCreator.getSession();
		
	}
	
	@Override
	public Album createAlbum(Photo[] photo, Album a) {
		session.getTransaction().begin();
		session.save(a);
		for(Photo p:photo) {
		p.setAlbum(a);	
		session.save(p);}
		session.getTransaction().commit();
		
		return a;
		
	}

	@Override
	public List<Album> getAlbums() {
		Query q = session.createQuery("from Album");
		return q.list();
	}

	@Override
	public Album findById(int id) {
		Album album = session.get(Album.class, id);
		return album;
	}

	@Override
	public void deleteById(int id) {
		//Deletion via photo
		Photo photo = session.get(Photo.class, id);
		//Photo photo = album.getPhoto();
		if(photo!=null)
		{
			session.getTransaction().begin();
			session.delete(photo);
			session.getTransaction().commit();
			System.out.println("Deleted.");
		}
		
	}

	@Override
	public Photo updateUrl(int id, String url, LocalDate date) {
		Photo photo = session.get(Photo.class, id);
		if(photo!=null)
		{	
		    photo.setUrl(url);
		    photo.getAlbum().setDate(date);
			session.getTransaction().begin();
			session.save(photo);
			session.getTransaction().commit();
			System.out.println("Updated.");
		}
		return photo;
	}
	@Override
	public void systemExit()
	{
		session.close();
	}

}
