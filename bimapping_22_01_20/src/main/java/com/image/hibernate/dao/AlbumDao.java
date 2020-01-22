package com.image.hibernate.dao;

import java.time.LocalDate;
import java.util.List;

import com.image.hibernate.model.Album;

public interface AlbumDao {
public Album createAlbum(Album adao);
public List<Album> getAlbums();
public Album findById(int id);
public void deleteById(int id);
public Album updateUrl(int id, String url, LocalDate date);
public void systemExit();
}
