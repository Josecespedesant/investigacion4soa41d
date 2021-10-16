package com.soa41d.calculator;

public class Addition implements Operation{
	double num1,num2;
	public Addition(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public double doOperation() {
		
		return num1+num2;
	}
	
	

}
