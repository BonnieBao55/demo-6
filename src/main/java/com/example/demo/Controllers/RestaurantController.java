package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Restaurant;
import com.example.demo.Repositories.RestaurantRepository;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @Autowired
    RestaurantRepository restaurantRepository;
    
    public List<Restaurant>getRestaurantByBorough(String boroughName){

        return restaurantRepository.findRestaurantByBorough(boroughName);
    }
}
