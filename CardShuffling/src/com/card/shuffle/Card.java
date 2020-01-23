package com.card.shuffle;

public class Card {
private String suite;
private String face;
private int number;
public Card(String suite, String face, int number) {
	super();
	this.suite = suite;
	this.face = face;
	this.number = number;
}
public String getSuite() {
	return suite;
}
public void setSuite(String suite) {
	this.suite = suite;
}
public String getFace() {
	return face;
}
public void setFace(String face) {
	this.face = face;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	if(getFace()==null)
	{
	return getNumber()+" Of "+getSuite() ;
	}
	else
	{
	return getFace()+" Of "+getSuite();	
	}
	}

}
