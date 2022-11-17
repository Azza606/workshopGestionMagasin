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
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture ;
    private  Float montantRemise;
    private Float montantFacture;
    private Date dateFacture;
    private boolean active;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures;

}
