package com.abstractclass.test;

public class WaterBus extends Transport {
	@Override
	double calculateDistance(double initialdistance, double finaldistance) {
		// TODO Auto-generated method stub]
	    setDistance(finaldistance-initialdistance);	
		return getDistance();
	}

	@Override
	double calculateEfficiency(double initialfuel, double finalfuel) {
		// TODO Auto-generated method stub
		setEfficiency(getDistance()/(initialfuel-finalfuel));
		return getEfficiency();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Water Bus's "+super.toString();
	}
}
