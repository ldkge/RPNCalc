import java.util.EmptyStackException;


public class InvalidArgsException extends EmptyStackException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getLocalizedMessage() {
		return "Invalid RPN Syntax";
	}

}
