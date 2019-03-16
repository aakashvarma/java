import java.util.*;

public class VideoLauncher {
	public static void main(String[] args) {
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// Make object
		VideoStore obj = new VideoStore();
		
		while(true) {
			System.out.println("MAIN MENU");
			System.out.println("=============");
			System.out.println("1. Add Videos");
			System.out.println("2. Check Out Video");
			System.out.println("3. Return Video");
			System.out.println("4. Receive Rating");
			System.out.println("5. List Inventory");
			System.out.println("6. Exit");
			System.out.print("Enter your choice (1..6): ");
			
			int n = sc.nextInt();
			
			System.out.println();
			
			switch(n){
				case 1:
					System.out.print("Enter the name of the video you want to add: ");
					String name = sc.next();
					obj.addVideo(name);
					System.out.println();
					break;
					
				case 2:
					System.out.print("Enter the name of the video you want to checkout: ");
					String name1 = sc.next();
					obj.doCheckout(name1);
					System.out.println();
					break;
					
				case 3:
					System.out.print("Enter the name of the video you want to checkout: ");
					String name2 = sc.next();
					obj.doReturn(name2);
					System.out.println();
					break;
					
				case 4:
					System.out.print("Enter the name of the video you want to rate: ");
					String name3 = sc.next();
					System.out.print("Enter the rating for this video: ");
					int rating = sc.nextInt();
					obj.receiveRating(name3, rating);
					System.out.println();
					break;
					
				case 5:
					obj.listInventory();
					System.out.println();
					break;
				
				case 6:
					System.out.println("Exiting...Thanks for using the application!!!");
	                return;
					
				default:
					System.out.println("Invalid number has been entered. Please enter valid number.");
			}
		}	
	}
}
