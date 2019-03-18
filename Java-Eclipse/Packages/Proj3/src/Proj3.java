import com.automobile.twowheeler.*;

public class Proj3 {
	public static void main(String[] args) {
		Hero hero = new Hero();
		Honda honda = new Honda();
		
		System.out.println("-----------------------------------------------");
		System.out.println("Model Name: " + hero.getModelName());
		System.out.println("Registration Number: " + hero.getRegistrationNumber());
		System.out.println("Owner Name: " + hero.getRegistrationNumber());
		System.out.println("Speed: " + hero.getSpeed());
		hero.radio();
		System.out.println("-----------------------------------------------");
		
		System.out.println("");
		
		System.out.println("-----------------------------------------------");
		System.out.println("Model Name: " + honda.getModelName());
		System.out.println("Registration Number: " + honda.getRegistrationNumber());
		System.out.println("Owner Name: " + honda.getRegistrationNumber());
		System.out.println("Speed: " + honda.getSpeed());
		honda.cdplayer();
		System.out.println("-----------------------------------------------");
	}
}
