package com.tante.landlordtenant.repository;

import com.tante.landlordtenant.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract,String>
{
}
