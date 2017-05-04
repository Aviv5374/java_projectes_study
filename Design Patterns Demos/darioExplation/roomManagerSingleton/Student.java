package roomManagerSingleton;

import java.util.Random;

import javax.management.relation.RoleInfoNotFoundException;


public class Student {

	private String id;
	private String name;

	public Student(String id, String name) throws InvalidStudentException {
		if (checkId(id) == false) {

			throw new InvalidStudentException("wrong id.");
		}

		if (checkName(name) == false) {

			throw new InvalidStudentException("invalid name format.");
		}
		this.id = id;
		this.name = name;
	}

	private boolean checkName(String name) {

		if (name.length() > 8 || name.length() < 2)
			return false;
		for (int i = 0; i < name.length(); i++) {
			if (!Character.isLetter(name.charAt(i)))
				return false;
		}

		return true;
	}

	private boolean checkId(String id2) {

		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}
	
	
	
	public void allocateRoom () throws RoomManagerExcepion 
	{
	   RoomManager manager = RoomManager.getInstance();
	   Random rand = new Random ();
	   manager.allocateRoom(this, rand.nextInt(4)+2);
		
	}

	@Override
	public String toString() {
		return name ;
	}
	

}
