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
	public Album createAlbum(Album adao) {
		session.getTransaction().begin();
		session.save(adao);
		session.getTransaction().commit();
		
		return adao;
		
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
	public Album updateUrl(int id, String url, LocalDate date) {
		Album album = session.get(Album.class, id);
		if(album!=null)
		{	album.setDate(date);
		    album.getPhoto().setUrl(url);
			session.getTransaction().begin();
			session.save(album);
			session.getTransaction().commit();
			System.out.println("Updated.");
		}
		return album;
	}
	@Override
	public void systemExit()
	{
		session.close();
	}

}
