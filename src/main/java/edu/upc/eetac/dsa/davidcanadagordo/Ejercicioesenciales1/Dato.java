package edu.upc.eetac.dsa.davidcanadagordo.Ejercicioesenciales1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dato implements Serializable {
	 
	public int a;
	public String b;
	public char c;
	   
	   
	public Dato (int a, String b, char c)  //Constructor con los datos
	   {
		   a=this.a;
		   b=this.b;
		   c=this.c;
	   }
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	   

}

