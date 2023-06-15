package models;

import java.util.List;

public class Theater extends BaseModel{
    private String name;
    private String address;
    private List<Auditorium> auditoriumList;
    private City city;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Auditorium> getAuditoriumList() {
        return auditoriumList;
    }

    public void setAuditoriumList(List<Auditorium> auditoriumList) {
        this.auditoriumList = auditoriumList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
