package roomAndManager;

import java.util.Random;

public class Room {
	static enum RoomState {
		Full, HaifFull, Free
	};

	private RoomState roomState = RoomState.Free;
	private final int roomNumber;
	private int roomSize;
	private Chair[] chairsInRoom;
	private int countOfTakenChairs = 0;

	public Room(int number, int size) {
		this.roomNumber = number;
		setRoomSize(size);
		this.chairsInRoom = new Chair[getRoomSize()];
		for (int i = 0; i < chairsInRoom.length; i++) {
			chairsInRoom[i] = new Chair();
		}
	}

	public RoomState getRoomState() {
		return roomState;
	}

	private void setRoomState(RoomState state) {
		this.roomState = state;
	}

	public int getRoomSize() {
		return roomSize;
	}

	private void setRoomSize(int size) {
		if (size < 3)
			this.roomSize = 3;
		else
			this.roomSize = size;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	int getCountOfTakenChairs() {
		return countOfTakenChairs;
	}

	void setCountOfTakenChairs(int newCountOfTakenChairs) {
		if (newCountOfTakenChairs < 0)
			this.countOfTakenChairs = 0;
		else
			this.countOfTakenChairs = newCountOfTakenChairs;
	}

	public void CheckForFreeChair() {
		int countOfTakenChairs = 0;
		for (int i = 0; i < chairsInRoom.length; i++) {
			if (chairsInRoom[i].isTaken() == false) {
				chairsInRoom[i].setTaken(true);
				countOfTakenChairs++;
				break;
			} else
				countOfTakenChairs++;
		}

		if (countOfTakenChairs == roomSize) {
			setRoomState(RoomState.Full);
		}

	}

	public void FreeTakenCheir() {
		if (getCountOfTakenChairs() <= 0) {
			System.out.println("there aren't chairs that need to be free");
			System.out.println("try again later");
			return;
		}
		
		Random rand = new Random();
		chairsInRoom[rand.nextInt(getCountOfTakenChairs())].setTaken(false);
		setCountOfTakenChairs(getCountOfTakenChairs() - 1);

		if (getRoomState() == RoomState.Full)
			setRoomState(RoomState.Free);
	}
}
