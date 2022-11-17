package com.esprit.workshop.controllers;

import com.esprit.workshop.entities.Client;
import com.esprit.workshop.services.ICLientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("client")
@AllArgsConstructor
public class ClientController {
    private  final ICLientService icLientService;

    @GetMapping("")
    public List<Client> retrieveAllClients(){
        List<Client> clients=icLientService.retrieveAllClients();
        return clients;
    }

    @DeleteMapping("/delete/{idClient}")
    public void deleteClient(@PathVariable  Long idClient){
       icLientService.deleteClient(idClient);
    }

    @PutMapping("")
    public Client updateClient (@RequestBody Client c){
        return icLientService.updateClient(c);
    }

    @GetMapping("/{idClient}")
    public Client retrieveClient (@PathVariable  Long idClient){
        return icLientService.retrieveClient(idClient);
    }
}


