package com.esprit.workshop.services;

import com.esprit.workshop.entities.Facture;

import java.util.List;

public interface IServiceFacture {
    public List<Facture> retrieveAllFactures();
    public void cancelFacture(Long id);
    public Facture retrieveFacture(Long id);
    public List<Facture> getFacturesByClient(Long idClient);
    public Facture addFacture(Facture f, Long idClient);
}
