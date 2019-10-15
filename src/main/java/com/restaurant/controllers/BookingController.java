package com.restaurant.controllers;


import com.restaurant.models.Booking;
import com.restaurant.models.Orders;
import com.restaurant.repositories.EventRepository;
import com.restaurant.repositories.HostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookingController {
    private EventRepository eventRepository;
    private HostRepository hostRepository;


    @Autowired
    public void setEventRepository(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
    @Autowired
    public void setHostRepository(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    @CrossOrigin
    @RequestMapping(path = "/events", method = RequestMethod.GET)
    public ResponseEntity<?> getEvents(){
        return new ResponseEntity<>(
                eventRepository.findAll(),
                HttpStatus.OK);
    }
    @CrossOrigin
    @RequestMapping(path ="/host/save", method = RequestMethod.POST)

    public ResponseEntity<?> saveHost(@RequestBody Booking booking){
        return new ResponseEntity<Booking>(
                hostRepository.save(booking),
                HttpStatus.CREATED);
    }
}

