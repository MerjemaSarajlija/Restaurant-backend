package com.restaurant.controllers;


import com.restaurant.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {

    private OrderRepository  orderReposiory;

    @Autowired
    public void setOrderReposiory(OrderRepository orderReposiory) {
        this.orderReposiory = orderReposiory;
    }

    @CrossOrigin
    @RequestMapping(path = "/order", method = RequestMethod.GET)
    public ResponseEntity<?> getOrders(){
        return new ResponseEntity<>(
                orderReposiory.findAll(),
                HttpStatus.OK);
    }

}
