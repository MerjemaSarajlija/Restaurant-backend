package com.restaurant.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name ="id", length = 100)
    private String id;
    @Column(name ="customerName", length = 100)
    private String customerName;
    @Column(name ="address", length = 100)
    private String address;
    @Column(name="food", length =30)
    private String food;

    public Orders() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
