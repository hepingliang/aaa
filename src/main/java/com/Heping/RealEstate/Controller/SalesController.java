package com.Heping.RealEstate.Controller;

import com.Heping.RealEstate.Entity.Client;
import com.Heping.RealEstate.Entity.Sales;
import com.Heping.RealEstate.Repository.ClientRepository;
import com.Heping.RealEstate.Repository.SalesRepository;
import com.Heping.RealEstate.Service.ClientServiceIn;
import com.Heping.RealEstate.Service.SalesServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Sales")
public class SalesController {

    @Autowired
    public SalesServiceIn salesServiceIn;

    @Autowired
    public ClientServiceIn clientServiceIn;

    @PostMapping("/AddNewSales")
    public Sales createSales(@RequestBody Sales newSales){

        return salesServiceIn.createSales(newSales);
    }

    @PostMapping("/AddNewCustomer")
    public Map<Sales,Client> addNewCustomer(@RequestParam Long salesId, @RequestParam Long clientId){

        return salesServiceIn.addCustomer(salesServiceIn.requestSales(salesId),clientServiceIn.requestClient(clientId));
    }
}
