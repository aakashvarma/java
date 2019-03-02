package exception;

public class NullStudentException extends Exception {
	
	public String toString() {
		return "NullStudentException occurred";
	}
	
	public NullStudentException(String e) {
		super(e);
	}
}

