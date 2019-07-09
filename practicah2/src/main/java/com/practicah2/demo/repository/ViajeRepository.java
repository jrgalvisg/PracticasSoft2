package com.practicah2.demo.repository;

import com.practicah2.demo.Model.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository

public interface ViajeRepository extends JpaRepository<Viaje, Serializable> {
}
