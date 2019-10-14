package com.restaurant.controllers;


import com.restaurant.models.Orders;
import com.restaurant.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @CrossOrigin
    @RequestMapping(path ="/order/save", method = RequestMethod.POST)

    public ResponseEntity<?> saveOrder(@RequestBody Orders order){
        return new ResponseEntity<Orders>(
                orderReposiory.save(order),
                HttpStatus.CREATED);
    }


}
