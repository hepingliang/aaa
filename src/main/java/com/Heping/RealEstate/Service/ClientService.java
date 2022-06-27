package com.Heping.RealEstate.Service;

import com.Heping.RealEstate.Entity.Client;
import com.Heping.RealEstate.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements ClientServiceIn {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client requestClient(Long id) {
        return clientRepository.findByClientId(id);
    }
}
