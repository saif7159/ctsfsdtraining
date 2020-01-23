package com.example.interfacetest;

public class MP3 implements ElectronicsInterface {
	
	double regularprice;
	String manufacturer;
	String colour;
	
	
	
	public MP3(double regularprice, String manufacturer, String colour) {
		super();
		this.regularprice = regularprice;
		this.manufacturer = manufacturer;
		this.colour = colour;
	}

	@Override
	public double computeSalesPrice() {
		// TODO Auto-generated method stub
		return getRegularPrice()*0.8;
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

	@Override
	public String getManufacturer() {
		// TODO Auto-generated method stub
		return manufacturer;
	}

	@Override
	public void setManufacturer(String manufacturer) {
		// TODO Auto-generated method stub
		this.manufacturer = manufacturer;
		
	}
	

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MP3, "+"Manufcaturer= "+getManufacturer()+", Colour= "+getColour();
	}
	

}
