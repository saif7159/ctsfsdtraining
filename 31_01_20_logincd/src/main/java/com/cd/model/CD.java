package com.cd.model;

import java.io.Serializable;

public class CD implements Serializable {

private static final long serialVersionUID = -8617993463020144183L;
private String name;
private String genre;
private String type;
public CD(String name, String genre, String type) {
	super();
	this.name = name;
	this.genre = genre;
	this.type = type;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "CD [name=" + name + ", genre=" + genre + ", type=" + type + "]";
}

}
