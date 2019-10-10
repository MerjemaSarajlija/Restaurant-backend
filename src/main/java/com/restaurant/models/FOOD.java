package com.restaurant.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class FOOD {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name ="id", length = 100)
    private String id;
    @Column(name ="name", length = 100)
    private String name;
    @Column(name ="price", length = 10)
    private Number price;

    public FOOD() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getPrice() {
        return price;
    }

    public void setPrice(Number price) {
        this.price = price;
    }


}
