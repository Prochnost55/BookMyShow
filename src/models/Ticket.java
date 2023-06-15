package models;

import java.util.List;

public class Ticket extends BaseModel{
    private List<ShowSeat> bookedSeats;
    private String name;
    private List<Payment> paymentList;

    public List<ShowSeat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<ShowSeat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }
}
