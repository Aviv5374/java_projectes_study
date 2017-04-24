package roomAndManager;

public class Room {
  private enum RoomState{Full,HaifFull,Free};//public static?
  private RoomState roomState=RoomState.Free;
  private final int roomNumber;
  private int roomSize;
  private Chair[] chairsInRoom;
  

public Room(int number, int size) {
	this.roomNumber = number;
	setRoomSize(size);
	this.chairsInRoom = new Chair[getRoomSize()];
	for(int i=0; i < chairsInRoom.length; i++){
		chairsInRoom[i] = new Chair(); 
	}
}

public RoomState getRoomState() {
	return roomState;
}

private void setRoomState(RoomState state) {
	this.roomState = roomState;
}

public int getRoomSize() {
	return roomSize;
}

private void setRoomSize(int size) {
	if(size<3)
	this.roomSize = 3;
	else
		this.roomSize = roomSize;
}

public int getRoomNumber() {
	return roomNumber;
}
  
public boolean CheckForFreeChair(){
	int countOfTakenChairs = 0;
	for (int i = 0; i < chairsInRoom.length; i++) {
		if(chairsInRoom[i].isTaken() == false){
			chairsInRoom[i].setTaken(true);
			countOfTakenChairs++;
			break;
		}
		else
			countOfTakenChairs++;
	}
	
	if(countOfTakenChairs == roomSize){
		setRoomState(RoomState.Full);	
	}
	
	return true;
}
//?
public Chair GetChairByIndex(){
	
}

}
