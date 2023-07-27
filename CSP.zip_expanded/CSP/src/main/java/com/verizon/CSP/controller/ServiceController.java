package com.verizon.CSP.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repository extends JpaRepository<Customer,Integer> {

}
