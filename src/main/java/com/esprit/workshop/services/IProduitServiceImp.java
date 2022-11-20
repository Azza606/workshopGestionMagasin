package com.esprit.workshop.services;

import com.esprit.workshop.entities.*;
import com.esprit.workshop.repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class IProduitServiceImp implements IProduitService {
    private  final PorduitRepository porduitRepository;
    private final StockRepository stockRepository;
    private  final FournisseurRepository fournisseurRepository;
    private final RayonRepository rayonRepository;
    private final FactureRepository factureRepository;


    @Override
    public List<Produit> retrieveAllProduits() {
        return porduitRepository.findAll();
    }

    @Transactional
    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Rayon rayon= rayonRepository.findById(idRayon).orElse(null);
        Stock stock= stockRepository.findById(idStock).orElse(null);
        if(rayon!= null && stock!=null){
            Produit produit = porduitRepository.save(p);
            rayon.getProduits().add(produit);
            stock.getProduits().add(produit);
            return produit;
        }
        return null ;
    }

    @Override
    public Produit retrieveProduit(Long idProduit) {
        return porduitRepository.findById(idProduit).orElse(null);
    }

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
        produit.getFournisseurs().add(fournisseur);
        }
        porduitRepository.save(produit);
    }

    @Override
    public float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate) {
        List<Produit>produits = porduitRepository.findAll();
        List<Facture> factures  = factureRepository.findAll();
        for(Produit produit1: produits){
           float prixUnitaire= produit1.getPrixUnitaire();
           float qte= produit1.getDetailFactures().get(0).getQte();
           float RevenuBrut = prixUnitaire*qte;
           return RevenuBrut;
        }
        return 0;
    }


}
