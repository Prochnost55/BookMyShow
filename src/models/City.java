package models;

public class City extends BaseModel {
    private String name;
    private Integer pincode;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Integer getPincode(){
        return this.pincode;
    }
    public void setPincode(Integer pincode){
        this.pincode = pincode;
    }
}
