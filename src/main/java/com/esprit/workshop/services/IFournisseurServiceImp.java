package com.esprit.workshop.services;

import com.esprit.workshop.entities.Fournisseur;
import com.esprit.workshop.entities.Produit;
import com.esprit.workshop.repositories.FournisseurRepository;
import com.esprit.workshop.repositories.PorduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IFournisseurServiceImp implements IFournisseurService {
    private  final FournisseurRepository fournisseurRepository;
    private final PorduitRepository porduitRepository;

    /*@Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {

        Produit produit= porduitRepository.findById(produitId).orElse(null);
        Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);
    }*/
}
