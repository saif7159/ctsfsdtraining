package com.image.hibernate.model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "ALBUM")
public class Album {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private LocalDate date;
private String albumname;
@OneToMany(mappedBy = "album", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
private List<Photo> photos;
public Album(String albumname, LocalDate date) {
	super();
	this.albumname = albumname;
	this.date = date;
	
}
public void addPhoto(Photo photo)
{
  if(photos == null)
  {
	  photos = new ArrayList<Photo>();
  }
  photos.add(photo);
}

@Override
public String toString() {
	return "Album [id=" + id + ", date=" + date + ", albumname=" + albumname + ", photo=" + photos + "]";
}

}
