package com.esprit.workshop.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Rayon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRayon ;
    private String codeRayon;
    private String libelleRayon;

    @OneToMany(mappedBy = "rayon")
    private List<Produit> produits;
}
