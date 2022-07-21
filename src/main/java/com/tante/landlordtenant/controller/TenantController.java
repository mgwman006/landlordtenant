package com.tante.landlordtenant.controller;

import com.tante.landlordtenant.model.Tenant;
import com.tante.landlordtenant.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resources;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TenantController
{
    @Autowired
    TenantService tenantService;

    @RequestMapping(value="/tenant", method = RequestMethod.POST)
    public Tenant createTenant (@RequestBody Tenant tenant)
    {
        return tenantService.createTenant(tenant);
    }

    @RequestMapping(value = "/tenants", method = RequestMethod.GET)
    public List<Tenant> getTenants()
    {
        return tenantService.getTenants();
    }

    @RequestMapping(value="/tenant{tenantId}", method = RequestMethod.GET)
    public Optional<Tenant> getTenant(@PathVariable(value = "tenantId") String tenantId)
    {
        return tenantService.getTenant(tenantId);
    }

    @RequestMapping(value="/tenant/{tenantId}", method=RequestMethod.DELETE)
    public void deleteTenant(@PathVariable(value = "tenantId") String tenantId)
    {
        tenantService.deleteTenant(tenantId);
    }

    @RequestMapping(value="/tenant/{tenantId}", method=RequestMethod.PUT)
    public Tenant updateTenant(@PathVariable(value = "tenantId") String tenantId, @RequestBody Tenant tenantDetails)
    {
        return tenantService.updateTenant(tenantId, tenantDetails);
    }


}
