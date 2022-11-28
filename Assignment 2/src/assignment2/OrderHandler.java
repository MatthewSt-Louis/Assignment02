package assignment2;

import java.io.IOException;

/**
 * This class is centered around the importance of the order of catch statements A compilation will occur
 * if your catch statements DO NOT follow the Exception hierarchy The lower in the hierarchy, the farther up
 * the catch chain it should be. 
 * @author Matthew St. Louis
 * @version 1.0
 * @since 11.0.16.1
 * @see Exception, IOException
 */
public class OrderHandler {
	/**
	 * Main testing area for the program where the exceptions are actually being thrown
	 * and demonstrating the correct 'order of operations' in regards to the hierarchy of 
	 * Exceptions.
	 * @param args
	 * @throws IOException, Exception
	 * */
	public static void main(String[] args) throws IOException, Exception {
		
		/**
		 * This an example of proper catch order.
		 * IOException must be caught first because it's the subclass and won't be
		 * explicitly handled if the super class came first.
		 */
		try {
			throw new IOException();
		}catch(IOException io) {
			System.err.println("Catching IOException first.");
		}catch(Exception e) {
			System.err.println("Superclass Exception caught last.");
		}
		/**
		 * Even here when IOException isn't actually being thrown, it still must be 
		 * handled first due to the hierarchy.
		 */
		try {
			throw new Exception();
		}catch(IOException e) {
			System.err.println("Looking for IOException first again.");
		}catch(Exception io) {
			System.err.println("Checking for superclass Exception second");
		}
	}

}
