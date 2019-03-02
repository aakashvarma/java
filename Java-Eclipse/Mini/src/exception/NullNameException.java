package exception;

public class NullNameException extends Exception {
	
	public String toString() {
		return "NullNameException occurred";
	}
	
	public NullNameException(String e) {
		super(e);
	}
}
