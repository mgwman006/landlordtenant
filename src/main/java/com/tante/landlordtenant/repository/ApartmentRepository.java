package com.tante.landlordtenant.repository;

import com.tante.landlordtenant.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment,String>
{
}
