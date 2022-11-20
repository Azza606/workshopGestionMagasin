package com.esprit.workshop.services;

import com.esprit.workshop.entities.Produit;

import java.util.Date;
import java.util.List;

public interface IProduitService {
    public List<Produit> retrieveAllProduits();
    public Produit addProduit(Produit p, Long idRayon, Long idStock);
    public Produit retrieveProduit(Long id);
    public void assignProduitToStock(Long idProduit, Long idStock);
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
    public float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate);

}
