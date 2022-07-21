package com.tante.landlordtenant.repository;

import com.tante.landlordtenant.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository<Tenant,String>
{

}
