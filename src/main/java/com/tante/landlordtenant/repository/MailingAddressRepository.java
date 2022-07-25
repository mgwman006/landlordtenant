package com.tante.landlordtenant.repository;

import com.tante.landlordtenant.model.MailingAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailingAddressRepository extends JpaRepository<MailingAddress,String>
{
}
