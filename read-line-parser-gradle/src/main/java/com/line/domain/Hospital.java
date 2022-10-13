package com.line.domain;

public class Hospital {
    private String id, address, district, category, name, subdivision;
    private int emergencyRoom;

    public Hospital(String id) {
        this.id = id;
    }

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
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
