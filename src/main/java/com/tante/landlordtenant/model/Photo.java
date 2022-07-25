package com.tante.landlordtenant.model;

import javax.persistence.*;

@Entity
@Table(name = "photos")
public class Photo
{
    @Id
    @Column(name ="photo_id")
    String photoId;

    @Column(name = "photo_path")
    String photoPath;

    @ManyToOne
    @JoinColumn(name = "apartment_id")
    Apartment apartment;

    @ManyToOne
    @JoinColumn(name = "house_id")
    Apartment house;

    public Photo() {
    }

    public Photo(String photoId, String photoPath, Apartment apartment, Apartment house) {
        this.photoId = photoId;
        this.photoPath = photoPath;
        this.apartment = apartment;
        this.house = house;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Apartment getHouse() {
        return house;
    }

    public void setHouse(Apartment house) {
        this.house = house;
    }


}
