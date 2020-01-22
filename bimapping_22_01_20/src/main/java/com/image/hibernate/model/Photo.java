package com.image.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PHOTO")
public class Photo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String url;
@OneToOne(mappedBy = "photo", cascade = CascadeType.ALL )
private Album album;
public Photo(String url) {
	super();
	this.url = url;
}
@Override
public String toString() {
	return "Photo [id=" + id + ", url=" + url + "]";
}


}
