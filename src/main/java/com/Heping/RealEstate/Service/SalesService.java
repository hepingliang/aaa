package com.Heping.RealEstate.Service;
import com.Heping.RealEstate.Entity.Client;
import com.Heping.RealEstate.Entity.Sales;
import com.Heping.RealEstate.Repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class SalesService implements SalesServiceIn {


    @Autowired
    SalesRepository salesRepository;





    @Override
    public Sales createSales(Sales newSales) {
        return salesRepository.save(newSales);
    }

    public Sales requestSales(Long id){
        return salesRepository.findBySalesId(id);
    }

    @Override
    public Map<Sales, Client> addCustomer(Sales sales, Client customer) {

        Map<Sales,Client> newPair = new HashMap<>();
        newPair.put(sales,customer);

        return newPair;
    }



}
