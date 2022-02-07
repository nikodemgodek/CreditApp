package com.example.creditapplication.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT c FROM customer c WHERE c.pesel = ?1")
    Iterable<Customer> findByPesel(@Param("pesel") String pesel);
}
