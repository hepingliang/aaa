package com.Heping.RealEstate.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table( name = "Pair")
public class SalesToClients {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "PairID")
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ID")
    private Sales salesId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ID")
    private Client clientId;

    public SalesToClients(Sales salesId, Client clientId) {

        this.salesId = salesId;
        this.clientId = clientId;
    }

    public SalesToClients() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sales getSalesId() {
        return salesId;
    }

    public void setSalesId(Sales salesId) {
        this.salesId = salesId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }
}
