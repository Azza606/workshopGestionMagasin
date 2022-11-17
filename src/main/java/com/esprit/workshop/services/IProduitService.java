package com.esprit.workshop.services;

public interface IProduitService {
    public void assignProduitToStock(Long idProduit, Long idStock);
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
}
