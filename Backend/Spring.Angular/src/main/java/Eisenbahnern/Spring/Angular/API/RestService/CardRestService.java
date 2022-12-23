package Eisenbahnern.Spring.Angular.API.RestService;

import Eisenbahnern.Spring.Angular.API.DTO.CardDTO;

import java.util.List;

public interface CardRestService {

    CardDTO popCard();

    List<CardDTO> distributeCards();

    CardDTO playCard();
}
