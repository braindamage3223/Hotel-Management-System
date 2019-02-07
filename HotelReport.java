
public class HotelReport {
	// Creating method, which will be used to provide output in HotelTest.
	public static void hotelReport(Hotel a) {
		System.out.println("Name of the hotel: " + a.getName() + "\nNumber of rooms: " + a.getRooms().size());

		for (int i = 0; i < a.getRooms().size(); i++) {
			System.out.println("Room " + (i + 1) + " has " + a.getRooms().get(i).getBeds().size() + " beds: "
					+ a.getRooms().get(i).getSingleBeds() + " single and " + a.getRooms().get(i).getDoubleBeds()
					+ " double.");
		}

		System.out.println("The maximum occupancy of hotel the is: " + a.maxOccupancy());

	}

}
