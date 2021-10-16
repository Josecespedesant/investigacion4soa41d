package com.soa41d.calculator;

public class Division implements Operation{
	double num1,num2;
	public Division(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public double doOperation() {
		if(num2 == 0d) {
			throw new IllegalArgumentException("Divisi�n no v�lida por 0");
		}else {
			return num1/num2; 
		}
	}

}
