package edu.upc.eetac.dsa.davidcanadagordo.Ejercicioesenciales1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.io.*;

public class LeerFichero {
	
	@SuppressWarnings("resource")
	public static void main( String[] args )
	    {
	        int num = 0;
	        String linea;
		    File archivo = null;
	        FileReader fr = null;
	        BufferedReader br = null;
	        try 
	        {
	        	archivo = new File ("C:/DSA/numeros.txt.txt");
	        	fr = new FileReader(archivo);
	        	br = new BufferedReader(fr);
	        	linea=br.readLine(); //leemos el archivo
	            
	            while(linea != null) //sino esta vacio
	            {
	            	try 
	            	{  
	            		num =  Integer.parseInt(linea);  //convertimos 
	            	}
	       catch (NumberFormatException e) { //por si hay un problema, catch
						throw new RuntimeException(e);
					}
	            		if(num > 1000)
	            		{
	            	throw new BigNumberException();  //si es mayor de 1000
	        				}
	            			else
	            			{
	            				System.out.println(linea);
	            				linea=br.readLine();
	            			}
	            	
	            }
	        }
	            
	        
	        catch(Exception e)
	        {
	            e.printStackTrace();
	         }
	        finally
	        {
	            // En el finally cerramos el fichero tanto si va bien como sino
	        	try{                    
	                if( null != fr ){   
	                   fr.close();     
	                   
	                }                  
	             }
	        	catch (Exception e2){ 
	                e2.printStackTrace();
	             }
	         }
	    }
}

	    

	            
	        

	        	


