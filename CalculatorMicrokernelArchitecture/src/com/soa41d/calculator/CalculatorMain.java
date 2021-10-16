package com.soa41d.calculator;

import java.util.Scanner;
import com.soa41d.additionalfeautres.Cosine;
import com.soa41d.additionalfeautres.Sine;
public class CalculatorMain {
	//El core es la aplicaciòn de la calculadora con 4 features,
	//Los plugins son las funcionalidades seno y coseno
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Ingrese la operación que desee realizar: \n"
	    		+ "1: Suma\n"
	    		+ "2: Resta\n"
	    		+ "3: Multiplicación\n"
	    		+ "4: División\n"
	    		+ "5: Coseno\n"
	    		+ "6: Seno\n");

	    String userName = myObj.nextLine(); 
	    int value = 0;
	    try {
	    	value = Integer.parseInt(userName);
	    }catch(NumberFormatException e){
	    	System.out.println("No ha ingresado un número");
	    }
	    
	    switch(value) {
	    	case 1:
	    	    System.out.println("Ingrese el primer número");
	    	    String num1 = myObj.nextLine(); 
	    	    double valueNum1 = 0;
	    	    
	    	    System.out.println("Ingrese el segundo número");
	    	    String num2 = myObj.nextLine(); 
	    	    double valueNum2 = 0;
	    	    
	    	    try {
	    	    	valueNum1 = Double.parseDouble(num1);
	    	    	valueNum2 = Double.parseDouble(num2);
	    	    	
	    	    	Addition add = new Addition(valueNum1, valueNum2);
	    	    	System.out.println("El resultado es: "+ add.doOperation());
	    	    }catch(NumberFormatException e){
	    	    	System.out.println("Uno de los dos inputs no es un número");
	    	    }
	    		break;
	    	case 2:
	    		System.out.println("Ingrese el primer número");
	    	    String num3 = myObj.nextLine(); 
	    	    double valueNum3 = 0;
	    	    
	    	    System.out.println("Ingrese el segundo número");
	    	    String num4 = myObj.nextLine(); 
	    	    double valueNum4 = 0;
	    	    
	    	    try {
	    	    	valueNum3 = Double.parseDouble(num3);
	    	    	valueNum4 = Double.parseDouble(num4);
	    	    	
	    	    	Substraction subs = new Substraction(valueNum3, valueNum4);
	    	    	System.out.println("El resultado es: "+ subs.doOperation());
	    	    }catch(NumberFormatException e){
	    	    	System.out.println("Uno de los dos inputs no es un número");
	    	    }
	    		break;
	    	case 3:
	    		System.out.println("Ingrese el primer número");
	    	    String num5 = myObj.nextLine(); 
	    	    double valueNum5 = 0;
	    	    
	    	    System.out.println("Ingrese el segundo número");
	    	    String num6 = myObj.nextLine(); 
	    	    double valueNum6 = 0;
	    	    
	    	    try {
	    	    	valueNum5 = Double.parseDouble(num5);
	    	    	valueNum6 = Double.parseDouble(num6);
	    	    	
	    	    	Multiplication mult  = new Multiplication(valueNum5, valueNum6);
	    	    	System.out.println("El resultado es: "+ mult.doOperation());
	    	    }catch(NumberFormatException e){
	    	    	System.out.println("Uno de los dos inputs no es un número");
	    	    }
	    		break;
	    	case 4:
	    		System.out.println("Ingrese el primer número");
	    	    String num7 = myObj.nextLine(); 
	    	    double valueNum7 = 0;
	    	    
	    	    System.out.println("Ingrese el segundo número");
	    	    String num8 = myObj.nextLine(); 
	    	    double valueNum8 = 0;
	    	    
	    	    try {
	    	    	valueNum7 = Double.parseDouble(num7);
	    	    	valueNum8 = Double.parseDouble(num8);
	    	    	
	    	    	Division div = new Division(valueNum7, valueNum8);
	    	    	System.out.println("El resultado es: "+ div.doOperation());
	    	    }catch(NumberFormatException e){
	    	    	System.out.println("Uno de los dos inputs no es un número");
	    	    }
	    		break;
	    	case 5:
	    		System.out.println("Ingrese el número");
	    	    String numCos = myObj.nextLine(); 
	    	    double valueNumCos = 0;
	    	    
	    	    
	    	    try {
	    	    	valueNumCos = Double.parseDouble(numCos);
	    	    	 
	    	    	Cosine cos = new Cosine(valueNumCos);
	    	    	System.out.println("El resultado es: "+ cos.doOperation());
	    	    }catch(NumberFormatException e){
	    	    	System.out.println("Uno de los dos inputs no es un número");
	    	    }
	    		break;
	    	case 6:
	    		System.out.println("Ingrese el número");
	    	    String numSin = myObj.nextLine(); 
	    	    double valueNumSin = 0;
	    	    
	    	    
	    	    try {
	    	    	valueNumSin = Double.parseDouble(numSin);
	    	    	 
	    	    	Sine sine = new Sine(valueNumSin);
	    	    	System.out.println("El resultado es: "+ sine.doOperation());
	    	    }catch(NumberFormatException e){
	    	    	System.out.println("Uno de los dos inputs no es un número");
	    	    }
	    		break;
	    	default:
	    		System.out.println("Numero ingresado no válido");
	    		break;
	    }
	    
	}
	
}
