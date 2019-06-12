package http_examples;

import java.net.*;
import java.io.*;

public class URL_connection_example {
	public static void main (String[] args) throws Exception{
		
	try {
		/**
		 * Creates URL
		 */
		URL itest = new URL("http://www.byui.edu/");
	
		/**
		 * Retrieves URL connection to testout site
		 */
		HttpURLConnection uc = (HttpURLConnection) itest.openConnection();
		
		/**
		 * reads in test object
		 */
		BufferedReader read = new BufferedReader(new InputStreamReader (uc.getInputStream()));
		
		/**
		 * reads URL from buffer
		 */
		String testInput;
		
		/**
		 * reads input from buffer and prints to console as long as there is data 
		 * to read from buffer
		 */
		while ((testInput = read.readLine()) != null)
			System.out.println(testInput);
		read.close();
			
		}	
	
	/**
	 * This catches errors which occur during connection. 
	 */
	catch(ConnectException ex) {
		System.out.println("You have received this error" + ex);
		}
	
	/**
	 * This catches input/output errors. 
	 */
	catch(IOException ex) {
		System.out.println("You have received this error: " + ex);
		}
	
	/**
	 * This catches any other exceptions that are thrown. 
	 */
	catch(Exception ex) {
		System.out.println("You have received a generic exception: " + ex);
	}
	
	
	}
}
