package com.image.hibernate.model;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "PHOTO_id")
private Photo photo;
public Album(String albumname, LocalDate date, Photo photo) {
	super();
	this.albumname = albumname;
	this.date = date;
	this.photo = photo;
	
}
@Override
public String toString() {
	return "Album [id=" + id + ", date=" + date + ", albumname=" + albumname + ", photo=" + photo + "]";
}

}
