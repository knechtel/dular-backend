package com.dular.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

/**
 * Created by maiquelknechtel on 10/07/24.
 */
@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String model;
    private String serial;
    private double price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id",nullable = false)
    @JsonIgnore
    private Client client;
    private Date entryDate;
    private Date departureDate;

    private Date entryEquipmentWarranty;
    private Date departureEquipmentWarranty;

    public Equipment(Client client) {
        this.client = client;
    }

    public Equipment() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getEntryEquipmentWarranty() {
        return entryEquipmentWarranty;
    }

    public void setEntryEquipmentWarranty(Date entryEquipmentWarranty) {
        this.entryEquipmentWarranty = entryEquipmentWarranty;
    }

    public Date getDepartureEquipmentWarranty() {
        return departureEquipmentWarranty;
    }

    public void setDepartureEquipmentWarranty(Date departureEquipmentWarranty) {
        this.departureEquipmentWarranty = departureEquipmentWarranty;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
