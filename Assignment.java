
public class Assignment {

	public static void main(String[] args) {
		Hotel hotel = new Hotel("The Oberoi", 3.5f, 200, "New market Bhopal");
		System.out.println("details of hotel are :" + hotel);
		System.out.println("............................");
		FoodRestaurant fr = new FoodRestaurant("The Oberoi", 3.5f, 200, "New market Bhopal", 40, "Excellent");
		System.out.println("Hotel FoodRestaurant details are : " + fr);
		System.out.println("............................");
		Feedback f = new Feedback("The Oberoi", 3.5f, 200, "New market Bhopal", "Moderate", "Excellent");
		System.out.println("Hotel Feedback from customer : " + f);
		System.out.println("............................");
	}

}

class Hotel {
	private String hotelName;
	private float hotelRating;
	private int noOfRooms;
	private String hotelAddress;

	public Hotel(String hotelName, float hotelRating, int noOfRooms, String hotelAddress) {
		super();
		this.hotelName = hotelName;
		this.hotelRating = hotelRating;
		this.noOfRooms = noOfRooms;
		this.hotelAddress = hotelAddress;
	}

	@Override
	public String toString() {
		return "[hotelName=" + hotelName + ", hotelRating=" + hotelRating + ", noOfRooms=" + noOfRooms
				+ ", hotelAddress=" + hotelAddress + "]";
	}
}

class FoodRestaurant extends Hotel {
	int sitingCapacity;
	String foodQuality;

	public FoodRestaurant(String hotelName, float hotelRating, int noOfRooms, String hotelAddress, int sitingCapacity,
			String foodQuality) {
		super(hotelName, hotelRating, noOfRooms, hotelAddress);
		this.sitingCapacity = sitingCapacity;
		this.foodQuality = foodQuality;
	}

	@Override
	public String toString() {
		return "FoodRestaurant [" + super.toString() + ", sitingCapacity=" + sitingCapacity + ", foodQuality="
				+ foodQuality + "]";
	}

}

class Feedback extends Hotel {
	String feedbackOfServices;
	String feedbackOffood;

	public Feedback(String hotelName, float hotelRating, int noOfRooms, String hotelAddress, String feedbackOfServices,
			String feedbackOffood) {
		super(hotelName, hotelRating, noOfRooms, hotelAddress);
		this.feedbackOfServices = feedbackOfServices;
		this.feedbackOffood = feedbackOffood;
	}

	@Override
	public String toString() {
		return "Feedback [toString()=" + super.toString() + ", feedbackOfServices=" + feedbackOfServices
				+ ", feedbackOffood=" + feedbackOffood + "]";
	}

}
