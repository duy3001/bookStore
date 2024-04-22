package com.project.bookStore.dao;

import com.project.bookStore.entity.ShippingMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "shipping-method")
public interface ShippingMethodRepository extends JpaRepository<ShippingMethod, Integer> {

}
