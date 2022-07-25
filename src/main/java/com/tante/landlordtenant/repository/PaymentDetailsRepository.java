package com.tante.landlordtenant.repository;

import com.tante.landlordtenant.model.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails,String>
{
}
