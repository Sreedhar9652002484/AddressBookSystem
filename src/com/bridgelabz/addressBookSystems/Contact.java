package com.bridgelabz.addressBookSystems;

public class Contact {
    private String firstName, lastName, email, address, city, state;
    private int zip;
    private long mobile;
    private String district;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    // calling to ContactPerson
    public String toString() {
        return "ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address="
                + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", mobile=" + mobile
                + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()="
                + getEmail() + ", getAddress()=" + getAddress() + ", getCity()=" + getCity() + 
                "getDistrict()=" + getDistrict() +", getState()="
                + getState() + ", getZip()=" + getZip() + ", getMobile()=" + getMobile() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}