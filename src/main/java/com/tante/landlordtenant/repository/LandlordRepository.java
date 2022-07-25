package com.tante.landlordtenant.repository;

import com.tante.landlordtenant.model.Landlord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandlordRepository extends JpaRepository<Landlord,String>
{
}
