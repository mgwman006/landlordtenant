package com.tante.landlordtenant.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "houses")
public class House
{
    @Id
    @Column(name = "house_id")
    String houseId;

    @OneToMany(mappedBy = "house", cascade = CascadeType.ALL)
    List<Photo> photoList;

    @OneToMany (mappedBy = "house", cascade = CascadeType.ALL)
    List<Apartment> apartments;

    @OneToOne (mappedBy = "house")
    MailingAddress address;

    @ManyToOne
    @JoinColumn(name = "landlord_id")
    Landlord landlord;

    public House() {
    }

    public House(String houseId, Landlord landlord) {
        this.houseId = houseId;
        this.landlord = landlord;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public List<Photo> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<Photo> photoList) {
        this.photoList = photoList;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    public MailingAddress getAddress() {
        return address;
    }

    public void setAddress(MailingAddress address) {
        this.address = address;
    }

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }
}
