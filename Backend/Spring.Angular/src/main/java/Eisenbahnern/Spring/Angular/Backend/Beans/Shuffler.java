package Eisenbahnern.Spring.Angular.Backend.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shuffler {

    @Autowired
    Deck deck = new Deck();



}
