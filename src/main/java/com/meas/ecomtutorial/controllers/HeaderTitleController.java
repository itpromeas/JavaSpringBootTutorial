package com.meas.ecomtutorial.controllers;

import com.meas.ecomtutorial.models.HeaderTitleModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/header-title") // http://localhost:8080/header-title
public class HeaderTitleController {

    // TODO: create one item -> POST
    @PostMapping("/create") // http://localhost:8080/header-title/create
    public List<HeaderTitleModel> createTitle(){

        List<HeaderTitleModel> myList = new ArrayList<HeaderTitleModel>();

        HeaderTitleModel title = new HeaderTitleModel();
        title.setName("My Home");
        title.setHref("#home");
        myList.add(title);

        HeaderTitleModel title2 = new HeaderTitleModel();
        title2.setName("Services");
        title2.setHref("#sevice");
        myList.add(title2);

        return myList;
    }

    // TODO: Get one item  -> GET

    // TODO: Get All items -> GET

    // TODO: update one item -> PUT

    // TODO: Delete one item -> DELETE


}
