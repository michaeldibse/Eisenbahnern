package Eisenbahnern.Spring.Angular.Backend.Beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Deck {

    private ArrayList <Card> cards;

    private String[] names = {"Sechser", "Siebener", "Achter", "Neuner", "Zehner", "Unter", "Ober", "König", "Sau", "Weli"};
    private String[] colours = {"Herz", "Schelle", "Laub", "Eiche"};

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public void fillDeck(){
        int j = -1;
        int z = 0;
        for(int i = 0; i < 36; i++){
            if(i % 9 == 0) {
                j++;
                z = 0;
            }
            Card card = new Card();
            if(j == 0){
                card.setTrump(true);
            }
            Integer value = z+6;
            String colour = colours[j];
            String name =  names[z];
            card.setValue(value);
            card.setColour(colour);
            card.setName(colour + " " + name);
            if (name == "Sau"){
                card.setValue(15);
            }
            if (colour == "Schelle" && value == 6){
                card.setTrump(true);
                card.setColour("Herz");
                card.setName("Weli");
                card.setValue(14);
            }
            System.out.println(card);
            cards.add(card);
            z++;
        }
        System.out.println(cards.size());

    }

}
