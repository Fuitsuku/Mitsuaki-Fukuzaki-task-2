package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;        //Foreign Key -> 1 Client : 1 Portfolio (Shared clientID)

    @Column(nullable = false)
    private long creationDate;    //Unix timestamp "Seconds from Jan01 1970 (UTC)."

    protected Portfolio(){ }

    public Portfolio(long portfolioId, long clientId, long creationDate)
    {
        this.portfolioId = portfolioId;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() { return portfolioId; }

    public long getClientId() { return clientId; }

    public void setClientId(long clientId) { this.clientId = clientId; }

    public long getCreationDate() { return creationDate; }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate; // Shouldn't be able to change this, only creating to follow directions
    }
}
