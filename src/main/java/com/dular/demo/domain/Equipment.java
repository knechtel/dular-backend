package com.dular.demo.domain;

import java.util.Date;

/**
 * Created by maiquelknechtel on 10/07/24.
 */
public class Equipment {

    private Integer id;
    private String model;
    private String serial;
    private double price;
    private Date entryDate;
    private Date departureDate;

    private Date entryEquipmentWarranty;
    private Date departureEquipmentWarranty;

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
}
