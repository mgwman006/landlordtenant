package com.tante.landlordtenant.model;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.util.List;

@Entity
@Table(name = "landlords")
public class Landlord
{
    @Id
    @Column(name = "landlord_id")
    private String landlordId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column (name="phone_number")
    private String phoneNumber;

    @Column (name = "email")
    private String email;

    @Column (name = "profile_picture")
    String profilePicture;

    @OneToMany(mappedBy = "landlord", cascade = CascadeType.ALL)
    private List<PaymentDetails> paymentDetails;

    @OneToMany(mappedBy = "landlord", cascade = CascadeType.ALL)
    private List<House> houses;

    @OneToMany(mappedBy = "landlord", cascade = CascadeType.ALL)
    private List<Contract> contracts;

    public Landlord() {
    }

    public Landlord(String landlordId, String firstName, String secondName, String phoneNumber, String email, String profilePicture) {
        this.landlordId = landlordId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.profilePicture = profilePicture;
    }

    public String getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(String landlordId) {
        this.landlordId = landlordId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public List<PaymentDetails> getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(List<PaymentDetails> paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
