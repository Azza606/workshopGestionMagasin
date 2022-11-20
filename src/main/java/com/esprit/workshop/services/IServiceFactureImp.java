package com.esprit.workshop.services;

import com.esprit.workshop.entities.Client;
import com.esprit.workshop.entities.DetailFacture;
import com.esprit.workshop.entities.Facture;
import com.esprit.workshop.entities.Produit;
import com.esprit.workshop.repositories.ClientRepository;
import com.esprit.workshop.repositories.FactureRepository;
import com.esprit.workshop.repositories.PorduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IServiceFactureImp implements IServiceFacture {
    private final FactureRepository factureRepository;
    private final ClientRepository clientRepository;
    private final PorduitRepository porduitRepository;


    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long idFacture) {
        Facture facture= factureRepository.findById(idFacture).orElse(null);
        if(facture.isActive()==false){
            factureRepository.deleteById(idFacture);
        }
    }

    @Override
    public Facture retrieveFacture(Long idFacture) {
        return factureRepository.findById(idFacture).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        return factureRepository.findByClientIdClient(idClient);
    }

    @Override
    public Facture addFacture(Facture f, Long idClient) {
        Client client= clientRepository.findById(idClient).orElse(null);

        DetailFacture detailFacture= new DetailFacture();
        Produit produit = new Produit();
       float PrixTotal = produit.getPrixUnitaire() * detailFacture.getQte();
        return null;
    }
}
