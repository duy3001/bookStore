package com.project.bookStore.dao;

import com.project.bookStore.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "payment-method")
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {

}
