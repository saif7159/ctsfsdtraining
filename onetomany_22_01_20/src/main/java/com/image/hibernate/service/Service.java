package com.image.hibernate.service;

import java.time.LocalDate;
import java.util.List;

import com.image.hibernate.model.Album;
import com.image.hibernate.model.Photo;

public interface Service {
	public Album createAlbum(Photo[] photo,Album a);
	public List<Album> getAlbums();
	public Album findById(int id);
	public void deleteById(int id);
	public Photo updateUrl(int id, String url, LocalDate date);
	public void systemExit();
}
