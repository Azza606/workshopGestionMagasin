package com.esprit.workshop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit ;
    private String codeProduit;
    private String libelleProduit;
    private Float prixUnitaire;

    @ManyToMany
    private List<Fournisseur> fournisseurs;

    @ManyToOne
    private Rayon rayon;

    @ManyToOne
    private Stock stock;

    @OneToOne
    private  DetailProduit detailProduit;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;
}
