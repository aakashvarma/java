import java.util.*;

public class VideoStore {
	
	// Member variables
	Video[] store = new Video[100];
	int index = -1;
	
	// Member functions
	int returnPos(String name) {
		int i = 0;
		while(i <= index) {
			if(store[i].videoName.equalsIgnoreCase(name)) return i;
			i++;
		}
		return -1;
	}
	
	public void addVideo(String name) {
		if (returnPos(name) < 0) {
            store[++index] = new Video(name);
            System.out.println("Video \"" + name + "\" has been added successfully.");
        }
        else System.out.println("Video already exists!!");
	}
	
	public void doCheckout(String name) {
		int i = returnPos(name);
		if (i >= 0) {
			store[i].doCheckout();
			System.out.println("Video \""+ name +"\" checkedout successfully.");
		}
		else System.out.println("Video doesnot exist.");
	}
	
	public void doReturn(String name) {
		int i = returnPos(name);
		if (i >= 0) {
			store[i].doReturn();
			System.out.println("Video \""+ name +"\" returned successfully.");
		}
		else System.out.println("Video doesnot exist.");
	}
	
	public void receiveRating(String name, int rating) {
		int i = returnPos(name);
		if (i >= 0) {
			store[returnPos(name)].receiveRating(rating);
			System.out.println("Rating \""+ rating + "\" has been mapped to the video \""+ name +"\".");
		}
		else System.out.println("Video doesnot exist.");
	}
	
	public void listInventory() {
        System.out.println("-----------------------------------------");
        System.out.println("Video Name    |Checkout Status    |Rating");
        if (index < 0) System.out.println("No videos to show!!");
        else for (int i = 0;i <= index;i++) {
            System.out.printf("%-13s |%15b \t  |%6d\n", store[i].videoName, store[i].checkout, store[i].rating);
        }
        System.out.println("-----------------------------------------");
	}
	
}
