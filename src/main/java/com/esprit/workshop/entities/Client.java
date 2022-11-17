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
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient ;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private String password;
    private CategorieClient categorieClient;
    private Profession profession;

    @OneToMany(mappedBy = "client")
    private List<Facture> factures;

}
