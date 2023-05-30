package com.ProyectoFinalLute.Proyecto.Final.repository;

import com.ProyectoFinalLute.Proyecto.Final.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
