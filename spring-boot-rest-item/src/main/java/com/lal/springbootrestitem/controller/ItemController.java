package com.lal.springbootrestitem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @RequestMapping(value = "/items", method = RequestMethod.GET)

    @ResponseBody
    public String getItem(){
        return "items";
    }
    
}
