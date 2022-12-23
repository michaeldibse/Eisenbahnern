package Eisenbahnern.Spring.Angular;

import Eisenbahnern.Spring.Angular.Backend.Beans.Deck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EisenbahnernApplication {


	public static void main(String[] args) {
		SpringApplication.run(EisenbahnernApplication.class, args);
		System.out.println("Eisenbahnern is running!!");

		Deck deck = new Deck();

		deck.fillDeck();
	}

}
