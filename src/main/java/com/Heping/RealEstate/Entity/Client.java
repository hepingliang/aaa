package com.Heping.RealEstate.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "Client")
public class Client {
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Id
    @Column( name="ID")
    private Long clientId;
    @Column( name="Name")
    private String clientName;
    @Column( name="PhoneNumber")
    private String phoneNum;

    @JsonIgnore
    @OneToMany(mappedBy = "clientId",cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    private Set< SalesToClients> pair = new HashSet<>();

    public Client(Long clientId, String clientName, String phoneNum) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.phoneNum = phoneNum;
    }

    public Client() {
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Set<SalesToClients> getPair() {
        return pair;
    }

    public void setPair(Set<SalesToClients> pair) {
        this.pair.clear();
        this.pair.addAll(pair);
    }
}
