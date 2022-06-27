package com.Heping.RealEstate.Service;

import com.Heping.RealEstate.Entity.Client;
import com.Heping.RealEstate.Entity.Sales;

import java.util.List;
import java.util.Map;

public interface SalesServiceIn {

    Sales createSales( Sales newSales );

    Sales requestSales( Long id);

    Map<Sales,Client> addCustomer( Sales sales,Client customer);

}
