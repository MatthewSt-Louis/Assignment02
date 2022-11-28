package assignment2;

import java.io.IOException;
/**
 * Another exception throwing/catching test class This one contains a checked exception
 * therefore it's declared with the main method Here we are testing that each exception thrown
 * can be handled by catching the superclass type Exception
 * @author Matthew St. Louis
 * @version 1.0
 * @since 11.0.16.1
 * @see Exception, IOException, NullPointerException
 */
public class DogHandler {
	/**Empty Throwable
	 * @see Exception
	 */
	@SuppressWarnings("serial")//avoiding warnings
	class ExceptionDog extends Exception {
	}

	/**Empty Throwable
	 * @see Exception
	 */
	@SuppressWarnings("serial")//avoiding warnings
	class ExceptionPuppy extends ExceptionDog{	
	}
	
	/**
	 * Main testing area for the program where we are checking that all InnerClass exceptions
	 * are being caught by type Exception in the catch block. Using printStackTrace() we show
	 * the user where and when the exception is being caught.
	 * @param args
	 * @throws IOException - required due to it being a checked exception
	 */
	public static void main(String[] args) throws IOException{
		/**Create handler object for throwing purposes*/
		DogHandler handler = new DogHandler();
		
		/**
		 * Testing ExceptionDog
		 * Catching with Exception
		 */
		try {
			throw handler.new ExceptionDog();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		/**
		 * Testing ExceptionPuppy
		 * Catching with Exception
		 */
		try {
			throw handler.new ExceptionPuppy();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		/**
		 * Throwing checked IOException
		 * Catching with Exception
		 */
		try {
			throw new IOException("IOException has been thrown and caught by type Exception in catch block");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		/**
		 * Throwing NullPointerException
		 * catching with Exception
		 */
		try {
			throw new NullPointerException("NullPointerException has been thrown and caught by type Exception in catch block");
		} catch(Exception e){
			System.err.println(e.getMessage());
		}

	}//end of main
}//end of class
