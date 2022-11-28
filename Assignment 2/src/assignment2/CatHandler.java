package assignment2;

/**
 * A simple exception throwing/catching test class This class uses a few inner classes that are 
 * descendants of the Exception superclass  We use a couple try/catch blocks to ensure the subclass
 * exception will be caught when catching the superclass type ExceptionAlpha. 
 * @author Matthew St. Louis
 * @version 1.0
 * @since 11.0.16.1
 * @see Exception
 */
public class CatHandler {
	/**
	 * Empty Throwable
	 * @see Exception
	 */
	@SuppressWarnings("serial")
	public class ExceptionAlpha extends Exception { 
		
	}
	/**
	 * Empty Throwable
	 * @see Exception
	 **/
	@SuppressWarnings("serial")
	public class ExceptionBeta extends ExceptionAlpha {
		
	}
	/**
	 * Empty Throwable
	 * @see Exception
	 **/
	@SuppressWarnings("serial")
	public class ExceptionGamma extends ExceptionBeta {	
	}
	/**
	 * Main Testing area for the program.
	 */
	public static void main(String[] args) {
		
		/**Required for creating new exceptions*/
		CatHandler handler = new CatHandler();
		
		/**Trying to throw Gamma exception*/
		try {
			/**Throw gamma exception*/
			throw handler.new ExceptionGamma();
			/**Catch with superclass*/
		} catch (ExceptionAlpha a) {
			a.printStackTrace();
	    }
		/**Trying to throw beta exception*/
		try {
			/**Throw beta exception*/
			throw handler.new ExceptionBeta();
			/**Catch with superclass*/
		} catch (ExceptionAlpha a) {
			a.printStackTrace();
		}
	}
}

