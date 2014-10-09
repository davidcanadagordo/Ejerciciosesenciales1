package edu.upc.eetac.dsa.davidcanadagordo.Ejercicioesenciales1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ejercicio4 {


	public static void main( String[] args) throws IOException
    {
	    File archivo = null;
	    FileWriter salida = null;
        FileReader fr = null;
        // FileWriter salida = null;
        BufferedReader br = null;
        //BufferedWriter bw = null;
        int con = 0;
        try
        {
        	archivo = new File ("C:/DSA/numeros.txt.txt");
        	salida = new FileWriter("C:/DSA/registro.txt");
        	BufferedWriter bw = new BufferedWriter(salida);
        	fr = new FileReader(archivo);
        	br = new BufferedReader(fr);
        	String linea;
        	
        	
            while((linea=br.readLine())!=null) {
        
        		
        		con = con + linea.length();
				
        	}	
            System.out.println("El número de caracteres es\t"  +  con );  //número de carácteres
        	
             
		        Calendar fecha = new GregorianCalendar();
		        int dia = fecha.get(Calendar.DAY_OF_MONTH);
		        int mes = fecha.get(Calendar.MONTH);
				int año = fecha.get(Calendar.YEAR);
			    int hora = fecha.get(Calendar.HOUR_OF_DAY);
				int minuto = fecha.get(Calendar.MINUTE);
				int segundo = fecha.get(Calendar.SECOND);
				String date = (dia + "/" + (mes) + "/" + año + " " + hora + ":" + minuto + ":" + segundo);
				System.out.println(date);  //fecha actual
				
				String c; //guardamos la fecha y los caracteres en register.txt
				c= "fecha\t" + date  + "numero de caracteres\t" + con ; 
				bw.write(c);
				bw.close();
				 
				 
             }
				catch(Exception e)
	         {
	            e.printStackTrace();
	         }
        
        
	        finally
	        {
	            // En el finally cerramos 
	            try
	            {                    
	               if( null != fr )
	               {   
	                  fr.close();     
	               }                  
	            }
	            catch (Exception e2)
	            { 
	               e2.printStackTrace();
	            }
	        }
        }
        }
  


