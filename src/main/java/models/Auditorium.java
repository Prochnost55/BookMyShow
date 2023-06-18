package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
public class Auditorium extends BaseModel{
    private String name; // primitive attribute

    // list of feature enum
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> featureList;

    @OneToMany
    private List<Seat> seatList;
}

// Relation between cardinalities:
// 1. find cardinality of relation
//    1. 1 - 1, id of one side on other side
//    2. 1 - M, id of 1 side on M side
//    3. M - M, create a mapping table
