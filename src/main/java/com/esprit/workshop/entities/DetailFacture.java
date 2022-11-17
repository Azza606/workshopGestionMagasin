package com.esprit.workshop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture ;
    private  Integer qte;
    private Float prixTotal;
    private Integer pourcentageRemise;
    private Float montantRemise;

    @ManyToOne
    private Produit produit;

    @ManyToOne
    private Facture facture;
}
