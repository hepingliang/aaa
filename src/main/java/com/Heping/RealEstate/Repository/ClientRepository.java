package com.Heping.RealEstate.Repository;

import com.Heping.RealEstate.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByClientId(Long id);
}
