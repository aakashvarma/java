
public class Video {
	
	// Member variables
	String videoName;
	boolean checkout;
	int rating;
	
	// Member functions
	public String getName() {
		return videoName;
	}
	public void doCheckout() {
		checkout = true;
	}
	public void doReturn() {
		checkout = false;
	}
	public void receiveRating(int rating) {
		this.rating = rating;
	}
	public int getRating() {
		return rating;
	}
	public boolean getCheckout() {
		return checkout;
	}
	
	// Constructor
	Video(String name){
		videoName = name;
	}
	
}
