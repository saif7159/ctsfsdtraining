package com.image.hibernate.service;

import java.time.LocalDate;
import java.util.List;

import com.image.hibernate.dao.AlbumDao;
import com.image.hibernate.dao.AlbumDaoImpl;
import com.image.hibernate.model.Album;

public class ServiceImpl implements Service {
	private AlbumDao dao = null;
	{
		dao = new AlbumDaoImpl();
	}
	
	@Override
	public Album createAlbum(Album adao) {
		
		return dao.createAlbum(adao);
	}

	@Override
	public List<Album> getAlbums() {
		
		return dao.getAlbums();
	}

	@Override
	public Album findById(int id) {
		
		return dao.findById(id);
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public Album updateUrl(int id, String url, LocalDate date) {
		
		return dao.updateUrl(id, url, date);
	}

	@Override
	public void systemExit() {
		dao.systemExit();
		
	}

}
