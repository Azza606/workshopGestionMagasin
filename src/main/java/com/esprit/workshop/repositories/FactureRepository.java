package com.esprit.workshop.repositories;

import com.esprit.workshop.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture, Long> {
    List<Facture> findByClientIdClient(Long idCLient);

    //float countByMontantFacture
}
