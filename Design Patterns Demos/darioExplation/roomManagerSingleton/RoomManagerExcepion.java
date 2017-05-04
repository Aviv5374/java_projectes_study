package roomManagerSingleton;

public class RoomManagerExcepion extends Exception 

{
    	String reason ="";

		public RoomManagerExcepion(String reason) {
			
			this.reason = reason;
		}

		public String getReason() {
			return reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
    	
    	
	

}
