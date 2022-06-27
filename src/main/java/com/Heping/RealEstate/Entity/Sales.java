package com.Heping.RealEstate.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table( name = "Sales" )
public class Sales {


    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Id
    @Column( name = "ID" )
    private Long salesId;
    @Column( name = "SalesName" )
    private String salesName;

    @Column( name = "Volume" )
    private int sellingVolume;

    @JsonIgnore
    @OneToMany(targetEntity = SalesToClients.class,mappedBy = "salesId",cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    private Set< SalesToClients> pair = new HashSet<>();


    public Sales(Long salesId, String salesName, int sellingVolume) {
        this.salesId = salesId;
        this.salesName = salesName;
        this.sellingVolume = sellingVolume;
    }

    public Sales() {
    }

    public Long getSalesId() {
        return salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public int getSellingVolume() {
        return sellingVolume;
    }

    public void setSellingVolume(int sellingVolume) {
        this.sellingVolume = sellingVolume;
    }

    public Set<SalesToClients> getPair() {
        return pair;
    }

    public void setPair(Set<SalesToClients> pair) {
        this.pair.clear();
        this.pair.addAll(pair);
    }
}
