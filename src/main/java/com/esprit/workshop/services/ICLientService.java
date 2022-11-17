package com.esprit.workshop.services;

import com.esprit.workshop.entities.Client;

import java.util.List;

public interface ICLientService {
    public List<Client> retrieveAllClients();
    public Client addClient(Client c);
    public void deleteClient(Long id);
    public Client updateClient(Client c);
    public Client retrieveClient(Long id);
}
