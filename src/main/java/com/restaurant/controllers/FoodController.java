package com.restaurant.controllers;

import com.restaurant.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
//@CrossOrigin(origins =  {"http://localhost:4200", "http://localhost:8082"})
public class FoodController {

    private FoodRepository foodRepository;


    @Autowired
    public void setFoodRepository(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @CrossOrigin
    @RequestMapping(path = "/food", method = RequestMethod.GET)
    public ResponseEntity<?> getFood(){
        return new ResponseEntity<>(
                foodRepository.findAll(),
                HttpStatus.OK);
    }

}



