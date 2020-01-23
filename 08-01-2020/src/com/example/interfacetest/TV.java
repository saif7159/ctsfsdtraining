package com.example.interfacetest;

public class TV implements ElectronicsInterface {
    int size;
    double regularprice;
    String manufacturer;
    

	public TV(int size, double regularprice, String manufacturer) {
		super();
		this.size = size;
		this.regularprice = regularprice;
		this.manufacturer = manufacturer;
	}

	@Override
	public double computeSalesPrice() {
		// TODO Auto-generated method stub
		return getRegularPrice()*0.9;
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
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "TV"+", Manufacturer= "+getManufacturer()+", Size= "+getSize();
	}
	

}
