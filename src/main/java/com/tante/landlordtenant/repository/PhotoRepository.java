package com.tante.landlordtenant.repository;

import com.tante.landlordtenant.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhotoRepository extends JpaRepository<Photo,String>
{
    List<Photo> findByHouseId(String houseId);
    List<Photo> findByApartmentId(String apartmentId);

    void deleteByHouseId(String houseId);
    void deleteByApartmentId(String apartmentId);
}
