package com.soft.cabinet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*@RestController*/
@Controller
public class Welcome {

@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Welcome(){
    ModelAndView model =new ModelAndView();
    model.setViewName("index");
    return model;
}
}
