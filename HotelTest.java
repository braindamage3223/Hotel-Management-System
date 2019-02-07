
public class HotelTest {
	//Creating hotel object and adding parameters
	public static void report(){
		Hotel a = new Hotel();
		a.setName("Abi");
		a.addRooms(1, 1, 1);
		a.addRooms(1, 1, 1);
		a.maxOccupancy();
		HotelReport.hotelReport(a);
	}
	public static void main(String[] args) {
		report();
	
	}
}
