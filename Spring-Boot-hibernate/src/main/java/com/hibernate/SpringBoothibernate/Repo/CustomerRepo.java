package com.hibernate.SpringBoothibernate.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.SpringBoothibernate.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long> {

}
