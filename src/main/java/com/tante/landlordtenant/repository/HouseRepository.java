package com.tante.landlordtenant.repository;

import com.tante.landlordtenant.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House,String>
{
}
