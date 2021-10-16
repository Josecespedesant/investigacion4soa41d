package com.soa41d.additionalfeautres;

public class Cosine implements Operation{
	double num1;
	public Cosine(double num1) {
		this.num1 = num1;
	}
	
	@Override
	public double doOperation() {
		
		return Math.cos(num1);
	}

}
