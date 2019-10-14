package com.restaurant.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name ="id", length = 100)
    private String id;
    @Column(name ="name", length = 100)
    private String name;
    @Column(name ="position", length = 100)
    private String position;
    @Column(name ="picture", length = 100)
    private String picture;

    public Employees() {
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


}
