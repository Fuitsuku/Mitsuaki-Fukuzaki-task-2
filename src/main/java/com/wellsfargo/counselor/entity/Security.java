package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long purchaseDate;   //Unix Timestamp "Seconds since Jan 01 1970 (UTC)"

    @Column(nullable = false)
    private float purchasePrice; //$x.xx format correctly to prevent rounding error

    @Column(nullable = false)
    private long quantity;

    protected Security() { }

    public Security(String name, String category, long purchaseDate, float purchasePrice, long quantity) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public long getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(long purchaseDate) { this.purchaseDate = purchaseDate; }

    public float getPurchasePrice() { return purchasePrice; }

    public void setPurchasePrice(float purchasePrice) { this.purchasePrice = purchasePrice; }

    public long getQuantity() { return quantity; }

    public void setQuantity(long quantity) { this.quantity = quantity; }
}
