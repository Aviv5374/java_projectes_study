package roomAndManager;

import java.util.Random;

import roomAndManager.Room.RoomState;

public class RoomManager {

	private static RoomManager instance = null;
	private Room[] rooms;
	private final int numberOfRooms=5;

	private RoomManager() {
		Random rand = new Random();
		this.rooms = new Room[numberOfRooms];
		for (int i = 0; i < rooms.length; i++) {
			int size = rand.nextInt(6) + 3;
			int num = i + 1;
			rooms[i] = new Room(num, size);
		}
	}

	public static RoomManager getInstance() {
		if (instance == null)
			return instance = new RoomManager();
		else
			return instance;
	}

	public int CheckForFreeRoom() {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i].getRoomState() == Room.RoomState.Free) {
				rooms[i].CheckForFreeChair();
				return rooms[i].getRoomNumber();
			}
		}
		System.out.println("There aren't free room in this moment.");
		System.out.println("try later");
		return 0;
	}

	public void FreeRoom(int roomNumber) {
		rooms[roomNumber-1].FreeTakenCheir();

	}

	public void StateOfTheRooms() {
		String[] stateOfRoom = new String[numberOfRooms];
		for (int i = 0; i < rooms.length; i++) {
			stateOfRoom[i]= "Room number"+ rooms[i].getRoomNumber()+"is"+rooms[i].getRoomState();	
		}
		for (String string : stateOfRoom) {
			System.out.println(string);
		}

	}
}
