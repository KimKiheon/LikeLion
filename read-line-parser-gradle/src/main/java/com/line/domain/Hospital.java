package com.line.domain;

public class Hospital {
    private String id, address, district, category, name, subdivision;
    private int emergencyRoom;
    public Hospital(String id){
        this.id=id.replaceAll("\"","");
    }

    public String getId() {
        return id;
    }
}
