package assignment2;

/**
 * Another example of exception handling In this class we are working with rethrown exceptions A method is 
 * declared that by default just throws an exception We then have another method that calls the former method
 * handles its exception, then immediately rethrows the exception.
 * @author Matthew St. Louis
 * @version 1.0
 * @since 11.0.16.1
 * @see Exception
 * @throws Exception
 */
public class FishHandler {
	
	/**
	 * This method simply throws the initial exception to be handled by easterStarting() 
	 */
	private void easterEnding() throws Exception {
		throw new Exception("This is the throw from inside easterEnding()\n");
	}
	/**
	 * This method is responsible for catching the exception thrown by easterEnding() and rethrowing it
	 * @throws Exception
	 */
	private void easterStarting() throws Exception{
		try {
			easterEnding();
		}catch (Exception e) {
			System.err.println("This is the exception being caught inside easterStarting()");
			e.printStackTrace();
			System.out.println();//just for some whitespace in the console
			easterEnding();
		}
	}	
	/**
	 * Here we are testing the method call of easterStarting() and ensuring all the exceptions are handled
	 * accordingly. A series of system error prints and printStackTrace() calls lets you know where the 
	 * exceptions are being thrown and caught
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		
		FishHandler handler = new FishHandler();
		try {
			handler.easterStarting();
		}catch(Exception e) {
			System.err.println("This is the exception being caught inside main() by calling easterStarting()");
			e.printStackTrace();
		}
	}
}
