package com.esprit.workshop.repositories;

import com.esprit.workshop.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
