package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Payment extends BaseModel{

    private Date timeOfPayment;
    private double amount;
    private String referenceId;

    @ManyToOne
    private Ticket ticket;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private PaymentMethod paymentMethod;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;


}
