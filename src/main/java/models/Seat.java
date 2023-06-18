package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Seat extends BaseModel{
    private String name;
    private Integer row;
    private Integer col;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    @Enumerated(EnumType.ORDINAL)
    private SeatStatus seatStatus;
}
