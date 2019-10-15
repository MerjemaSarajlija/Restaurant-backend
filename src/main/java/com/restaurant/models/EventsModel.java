package com.restaurant.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class EventsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name ="id", length = 100)
    private String id;
    @Column(name ="eventName", length = 100)
    private String eventName;

    public EventsModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
