package com.Heping.RealEstate.Controller;

import com.Heping.RealEstate.Entity.Client;
import com.Heping.RealEstate.Service.ClientServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/Client")
public class ClientController {


    @Autowired
    ClientServiceIn clientServiceIn;


    @PostMapping("/AddNewClient")
    public Client create(@RequestBody Client client){

        return clientServiceIn.createClient(client);
    }

    @RequestMapping("/request")
    public Client request( @RequestParam Long id){

        return clientServiceIn.requestClient(id);
    }
}
