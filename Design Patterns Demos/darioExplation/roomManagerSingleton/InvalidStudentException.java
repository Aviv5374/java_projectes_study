package roomManagerSingleton;

public class InvalidStudentException extends Exception {


	String reason ="";

	public InvalidStudentException(String reason) {
		
		this.reason = reason;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
