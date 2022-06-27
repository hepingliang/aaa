package com.Heping.RealEstate.Repository;

import com.Heping.RealEstate.Entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository <Sales, Long> {

    Sales findBySalesId( Long id);

}
