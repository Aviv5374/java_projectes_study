package roomManagerSingleton;

public class Room {

	private boolean roomState;
	private int roomNumber; 
	private  int roomSize;
	private Student owner;
	
	
	public Room(int roomNumber, int roomSize) {
		
		setRoomNumber(roomNumber);
		setRoomSize(roomSize);
		setRoomState(false);
		setOwner(null);
	}


	public boolean isRoomState() {
		return roomState;
	}


	public void setRoomState(boolean roomState) {
		this.roomState = roomState;
	}


	public int getRoomSize() {
		return roomSize;
	}


	public void setRoomSize(int roomSize) {
		this.roomSize = roomSize;
	}


	public Student getOwner() {
		return owner;
	}


	public void setOwner(Student owner) {
		this.owner = owner;
	}

    private void setRoomNumber( int number)
    {
    	this.roomNumber = number;
    	
    }
	public int getRoomNumber() {
		return roomNumber;
	}


	@Override
	public String toString() {
		
		return   String.format("%12s%13s%12s%12s",roomNumber,roomState,roomSize,owner );
				
				
	} 
	
	
	
	
	
	
}
