import java.util.*;

public class HotelConfigure {
	public static void printReport() {
		Scanner input = new Scanner(System.in);
		// Creating Hotel object and adding parameters using Scanner
		Hotel a = new Hotel();
		System.out.println("Enter the name of the hotel: ");
		a.setName(input.nextLine());
		System.out.println("Enter the number of rooms: ");
		int rooms = input.nextInt();
		// Using for loop to ask the user for in each room.
		for (int i = 0; i < rooms; i++) {
			System.out.println("Room " + (i + 1) + ", number of Single beds: ");
			a.addSingleBed(input.nextInt());
			System.out.println("Number of Double beds: ");
			a.addDoubleBed(input.nextInt());
			System.out.println("If the room is vacant type true, else type false: ");
			a.getRooms().get(i).setVacant(input.nextBoolean());
		} // Printing out the hotel
		System.out.println("Name of the hotel is " + a.getName() + "\nNumber of rooms: " + rooms
				+ "\nThe maximum occupancy of the hotel is: " + a.maxOccupancy() + "\nVacancy: " + a.hasVacancy());

	}

	public static void main(String[] args) {
		printReport();

	}
}
