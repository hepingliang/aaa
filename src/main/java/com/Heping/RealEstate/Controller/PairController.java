package com.Heping.RealEstate.Controller;

import com.Heping.RealEstate.Entity.Client;
import com.Heping.RealEstate.Entity.Sales;
import com.Heping.RealEstate.Service.PairServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;



@RestController
@RequestMapping("/Pair")
public class PairController {

    @Autowired
    PairServiceIn pairServiceIn;
    @PostMapping("/newPair")
    public String pair(@RequestParam Long clientID,@RequestParam Long salesID){

        pairServiceIn.pair(clientID, salesID);

        return "OK";
    }


}
