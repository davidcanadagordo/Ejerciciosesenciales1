package edu.upc.eetac.dsa.davidcanadagordo.Ejercicioesenciales1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		
	File ejercicio4 = null;
    FileReader fr4 = null;
    File ejercicio5 = null;
    FileReader fr5= null;
    BufferedReader br4 = null;
    BufferedReader br5 = null;
    
    
    
    		try
    		{
    			ejercicio4 = new File ("C:/Users/DaviD/workspace/Ejercicio6/registro.txt");
    			ejercicio5 = new File ("C:/Users/DaviD/workspace/Ejercicio6/resultado.txt");
    			fr4 = new FileReader(ejercicio4);
    			fr5 = new FileReader(ejercicio5);
    			br4 = new BufferedReader(fr4); //cargamos buffer con contenido registro.txt
    			br5 = new BufferedReader(fr5); //cargamos buffer con conternido resultado.txt
    			long con1,con2;
    			String linea4;
    			String linea5;
    			linea4 = br4.readLine(); //leemos 
    			linea5 = br5.readLine(); //leemos
    			con1 = ejercicio4.length();
    			con2 = ejercicio5.length();
    			while ((linea4  !=null) && (linea5 != null))
    			{
    			if( con1 > con2)
    			{
    				System.out.println(linea4);
    				break;
    			}
    			else
    			{
    				System.out.println(linea5);
    			    break;
    			}
    			}
    			

    		}
    		catch (IOException e)
    		{
                e.printStackTrace();
    		}
  
    		

		}
}
