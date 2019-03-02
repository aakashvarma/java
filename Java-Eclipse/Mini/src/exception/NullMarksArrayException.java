package exception;

public class NullMarksArrayException extends Exception {
	
	public String toString() {
		return "NullMarksArrayException occurred";
	}
	
	public NullMarksArrayException(String e) {
		super(e);
	}
}

