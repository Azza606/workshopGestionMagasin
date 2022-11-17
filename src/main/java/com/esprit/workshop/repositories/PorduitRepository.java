package com.esprit.workshop.repositories;

import com.esprit.workshop.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PorduitRepository extends JpaRepository<Produit, Long> {
}
