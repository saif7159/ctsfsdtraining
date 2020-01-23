package com.example.interfacetest;

public class Book implements ProductInterface{
 
    private double regularprice;
    private String publisher;
    private int yearpublished;
	public Book( double regularprice, String publisher, int yearpublished) {
		super();
		this.regularprice = regularprice;
		this.publisher = publisher;
		this.yearpublished = yearpublished;
	}

	@Override
	public double computeSalesPrice() {
		// TODO Auto-generated method stub
		return getRegularPrice()*0.5;
	}

	@Override
	public double getRegularPrice() {
		// TODO Auto-generated method stub
		return regularprice;
	}
	@Override
	public void setRegularPrice(double regularprice) {
		// TODO Auto-generated method stub
	     this.regularprice = regularprice;	
	}
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearpublished() {
		return yearpublished;
	}

	public void setYearpublished(int yearpublished) {
		this.yearpublished = yearpublished;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book"+", Publisher= "+getPublisher()+", Year= "+getYearpublished();
	}
	

	

	

}
