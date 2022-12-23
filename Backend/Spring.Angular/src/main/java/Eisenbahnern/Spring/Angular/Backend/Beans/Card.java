package Eisenbahnern.Spring.Angular.Backend.Beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Card {

    private Integer value;

    private Boolean trump = false;

    //@Enumerated(EnumType.STRING)
    private String colour;
    //@Enumerated(EnumType.STRING)
    private String name;

}

