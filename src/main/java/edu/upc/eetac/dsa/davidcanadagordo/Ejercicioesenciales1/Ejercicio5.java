package edu.upc.eetac.dsa.davidcanadagordo.Ejercicioesenciales1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ejercicio5 {
	
	public static void main(String[] arg) throws IOException {
		File archivo = null;
	    FileWriter salida = null;
	    FileReader fr = null;
	   
	    try
	    {
	    		
	    	    //Path path = Paths.get("C:/DSA/imagen.jpg");	
	    		archivo = new File("C:/Users/DaviD/workspace/Ejercicio5/imagen.jpg");
	    	    fr = new FileReader(archivo);
	        	salida = new FileWriter("C:/Users/DaviD/workspace/Ejercicio5/resultado.txt");
	        	BufferedWriter bw = new BufferedWriter(salida);
	        	
	        	long con;
	        	con=archivo.length();
	        	
	            System.out.println("El número de bytes es\t"  + con);  //número de bytes
	        	
	         
		        Calendar fecha = new GregorianCalendar();
		        int dia = fecha.get(Calendar.DAY_OF_MONTH);
		        int mes = fecha.get(Calendar.MONTH);
				int año = fecha.get(Calendar.YEAR);
			    int hora = fecha.get(Calendar.HOUR_OF_DAY);
				int minuto = fecha.get(Calendar.MINUTE);
				int segundo = fecha.get(Calendar.SECOND);
				String date = (dia + "/" + (mes) + "/" + año + " " + hora + ":" + minuto + ":" + segundo);
				System.out.println(date);  //fecha actual
				
				String c; //guardamos la fecha y los bytes en resultado.txt
			    c= "fecha\t" + date  + "numero de bytes\t" + con; 
				bw.write(c);
				bw.close();
				 
				 
	         }
				catch(IOException e)
	         {
	            e.printStackTrace();
		     }
			    finally {
					if (fr != null) {
						fr.close();
					}
					if (salida != null) {
					    salida.close();
					}
			    }
	}
	}


	    
	     

