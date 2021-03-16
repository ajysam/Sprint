package com.cg.customerManagement.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.customerManagement.customer.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}