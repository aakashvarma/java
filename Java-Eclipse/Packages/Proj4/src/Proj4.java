import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import com.automobile.fourwheeler.*;

public class Proj4 {
	public static void main(String[] args) {
		Hero hero = new Hero();
		Honda honda = new Honda();
		Logan logan = new Logan();
		Ford ford = new Ford();
		
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
		
		System.out.println("");
		
		System.out.println("-----------------------------------------------");
		System.out.println("Model Name: " + logan.getModelName());
		System.out.println("Registration Number: " + logan.getRegistrationNumber());
		System.out.println("Owner Name: " + logan.getRegistrationNumber());
		System.out.println("Speed: " + logan.speed());
		System.out.println("Gps: " + logan.gps());
		System.out.println("-----------------------------------------------");
		
		System.out.println("");
		
		System.out.println("-----------------------------------------------");
		System.out.println("Model Name: " + ford.getModelName());
		System.out.println("Registration Number: " + ford.getRegistrationNumber());
		System.out.println("Owner Name: " + ford.getRegistrationNumber());
		System.out.println("Speed: " + ford.speed());
		System.out.println("Temperature: " + ford.tempControl());
		System.out.println("-----------------------------------------------");
	}
}
