package com.line.domain;

public class Hospital {
    private String id; //[0]
    private String address; //[1]
    private String district;
    private String category; //[3]
    private String name;//[10]
    private String subdivision;
    private int emergencyRoom; //[6]

    public Hospital(String id) {
        this.id = id;
    }

    public Hospital(String id, String address) {
        this.id = id.replaceAll("\"","");
        this.address = address.replaceAll("\"","");
    }

    public Hospital(String id, String address, String category, Integer emergencyRoom, String name, String subdivision) {
        this.id = id.replaceAll("\"","");
        this.address = address.replaceAll("\"","");;
        this.category = category.replaceAll("\"","");;
        this.name = name.replaceAll("\"","");;
        this.subdivision = subdivision.replaceAll("\"","");;
        this.emergencyRoom = emergencyRoom;
        setDistrict();
    }
    public void setDistrict(){
        String[] splitted = this.address.split(" ");
        this.district = String.format("%s %s", splitted[0], splitted[1]);
    }

    public String getId() {
        return id;
    }
    public int getEmergencyRoom() {
        return emergencyRoom;
    }
    public String getSubdivision() {
        return subdivision;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public String getDistrict() {
        return district;
    }
    public String getAddress() {
        return address;
    }
}
