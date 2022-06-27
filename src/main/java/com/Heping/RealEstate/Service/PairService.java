package com.Heping.RealEstate.Service;

import com.Heping.RealEstate.Entity.Client;
import com.Heping.RealEstate.Entity.Sales;
import com.Heping.RealEstate.Entity.SalesToClients;
import com.Heping.RealEstate.Repository.ClientRepository;
import com.Heping.RealEstate.Repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class PairService implements PairServiceIn{
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    SalesRepository salesRepository;

    @Override
    public void pair(Long clientID, Long salesID) {

        Client clientInfo =  clientRepository.findByClientId(clientID);

        Sales salesInfo = salesRepository.findBySalesId(salesID);

        Set<SalesToClients> sales = new HashSet<>();

        sales.add(new SalesToClients(salesInfo,clientInfo));

        clientInfo.setPair(sales);
        salesInfo.setPair(sales);

        clientRepository.save(clientInfo);
        salesRepository.save(salesInfo);

    }
}
