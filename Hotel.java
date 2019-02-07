
import java.util.ArrayList;
import java.util.List;

public class Hotel {
	// Declaring fields and set and get methods
	private String name;
	private List<Room> rooms = new ArrayList<>();
	private boolean isVacant;

	public Hotel() {
		setName(name);
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRooms(int rooms) {

	}

	// Method for adding Rooms
	public void addRooms(int rooms, int singleBed, int doubleBed) {
		for (int i = 0; i < rooms; i++) {
			addBeds(singleBed, doubleBed);
		}
	}

	// Method for adding beds( single and double)
	public void addBeds(int singleBed, int doubleBed) {
		Room a = new Room();

		for (int i = 0; i < singleBed; i++) {
			a.addBeds(Bed.SINGLEBED);
		}
		for (int j = 0; j < doubleBed; j++) {
			a.addBeds(Bed.DOUBLEBED);
		}
		rooms.add(a);

	}

	// Method for adding only single bed(used in HotelConfigure)
	public void addSingleBed(int singleBed) {
		Room a = new Room();
		for (int i = 0; i < singleBed; i++) {
			a.addBeds(Bed.SINGLEBED);
		}
		rooms.add(a);
	}

	// Method for adding only double bed(used in HotelConfigure)
	public void addDoubleBed(int doubleBed) {
		Room a = new Room();
		for (int i = 0; i < doubleBed; i++) {
			a.addBeds(Bed.DOUBLEBED);
		}
		rooms.add(a);
	}

	// Method used for calculating the Maximum occupancy of the hotel
	public int maxOccupancy() {
		int k = 0;
		for (Room j : rooms) {
			k = k + j.getSingleBeds();
			k = k + 2 * j.getDoubleBeds();

		}
		return k;
	}

	// set and get method for vacancy
	public boolean isVacant() {
		return isVacant;
	}

	public void setVacant(boolean isVacant) {
		this.isVacant = isVacant;
	}

	/*
	 * Creating method, which checks if any room is vacant(if 1 room is vacant,
	 * returns true, which means that the hotel has at least 1 vacant room
	 */
	public boolean hasVacancy() {
		for (Room j : rooms) {
			if (j.getIsVacant() == true) {
				return true;
			}
		}
		return false;
	}

}
