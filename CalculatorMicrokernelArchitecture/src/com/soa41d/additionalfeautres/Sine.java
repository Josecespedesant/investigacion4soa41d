package com.soa41d.additionalfeautres;

public class Sine implements Operation{
	double num1;
	public Sine(double num1) {
		this.num1 = num1;
	}
	
	@Override
	public double doOperation() {
		
		return Math.sin(num1);
	}

}
