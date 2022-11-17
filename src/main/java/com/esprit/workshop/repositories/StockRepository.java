package com.esprit.workshop.repositories;

import com.esprit.workshop.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
