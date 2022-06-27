package com.Heping.RealEstate.Service;

import com.Heping.RealEstate.Entity.Client;

public interface ClientServiceIn {

    Client createClient(Client client);

    Client requestClient(Long id);
}
