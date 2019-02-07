import java.util.ArrayList;
import java.util.List;

public class Room {

	// Declaring fields
	private List<Bed> beds = new ArrayList<>();
	private boolean isVacant;

	public List<Bed> getBeds() {
		return beds;
	}

	// Checking if the bed is single
	public int getSingleBeds() {
		int i = 0;
		for (Bed b : beds) {
			if (b.getBedSize() == Bed.SINGLEBED) {
				i++;
			}
		}
		return i;
	}

	// Checking if the bed is double
	public int getDoubleBeds() {
		int j = 0;
		for (Bed b : beds) {
			if (b.getBedSize() == Bed.DOUBLEBED) {
				j++;
			}
		}
		return j;
	}

	// Creating method for adding beds
	public void addBeds(String bedSize) {
		Bed b = new Bed();
		b.setBedSize(bedSize);
		beds.add(b);
	}

	public boolean getIsVacant() {
		return isVacant;
	}

	public void setVacant(boolean isVacant) {
		this.isVacant = isVacant;
	}

}
