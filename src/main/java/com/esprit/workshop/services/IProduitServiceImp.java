package com.esprit.workshop.services;

import com.esprit.workshop.entities.Fournisseur;
import com.esprit.workshop.entities.Produit;
import com.esprit.workshop.entities.Stock;
import com.esprit.workshop.repositories.FournisseurRepository;
import com.esprit.workshop.repositories.PorduitRepository;
import com.esprit.workshop.repositories.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IProduitServiceImp implements IProduitService {
    private  final PorduitRepository porduitRepository;
    private final StockRepository stockRepository;
    private  final FournisseurRepository fournisseurRepository;

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit= porduitRepository.findById(idProduit).orElse(null);
        Stock stock =  stockRepository.findById(idStock).orElse(null);

        if(stock!=null && produit!=null){
            produit.setStock(stock);
        }

        porduitRepository.save(produit);
    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Produit produit= porduitRepository.findById(produitId).orElse(null);
        Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);

        if(produit!=null && fournisseur!=null){
            
        }
    }


}
