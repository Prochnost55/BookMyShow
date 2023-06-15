package models;

public class ShowSeat extends BaseModel{
    private Show show;
    private Seat seat;
    private SeatBookingStatus seatBookingStatus;
    private Float price;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public SeatBookingStatus getSeatBookingStatus() {
        return seatBookingStatus;
    }

    public void setSeatBookingStatus(SeatBookingStatus seatBookingStatus) {
        this.seatBookingStatus = seatBookingStatus;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
