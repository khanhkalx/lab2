package com.example.lab2;

public class Contact {
    private int id;
    private String Name;
    private String PhoneNumber;
    private Boolean Status;
    private String avatarPath;

    public Contact(){

    }
    public Contact(int id, String name, String phoneNumber, Boolean status, String path) {
        this.id = id;
        Name = name;
        PhoneNumber = phoneNumber;
        Status = status;
        avatarPath = path;

    }
    public Contact(int id, String name, String phoneNumber, Boolean status) {
        this.id = id;
        Name = name;
        PhoneNumber = phoneNumber;
        Status = status;
    }
    public Contact( String name, String phoneNumber, Boolean status) {

        Name = name;
        PhoneNumber = phoneNumber;
        Status = status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }
}
