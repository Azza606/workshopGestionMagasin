package com.esprit.workshop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class DetailProduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailProduit ;
    private Date dateCreation;
    private Date DateDernierModification;
    private CategorieProduit categorieProduit;

    @OneToOne(mappedBy = "detailProduit")
    private  Produit produit;
}
