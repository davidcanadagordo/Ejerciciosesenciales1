package edu.upc.eetac.dsa.davidcanadagordo.Ejercicioesenciales1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Ejercicio7 {
	public static void main(String[] args) throws Exception {
		
		Dato dato1 = new Dato(1, "dato1", 'a');
		Dato dato2 = new Dato(2, "dato2", 'b');
		Dato dato3 = new Dato(3, "dato3", 'c');
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try
		{
			fout = new FileOutputStream("C:/DSA/datos1.txt");
			out = new ObjectOutputStream(fout);
			out.writeObject(dato1);
	        out.writeObject(dato2);
	        out.writeObject(dato3);
	        out.close();
	     
	        System.out.println("Fichero creado");
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try
		{
			fin = new FileInputStream("C:/DSA/datos1.txt");
			in = new ObjectInputStream(fin);
			dato1 = (Dato)in.readObject();
			dato2 = (Dato)in.readObject();
			dato3 = (Dato)in.readObject();
			in.close();
	    
	        System.out.println("Datos recuperados");
		}
		
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		finally
		{
		System.out.println(dato1);
		System.out.println(dato2);
		System.out.println(dato3);
		}
		
	   }
	}
