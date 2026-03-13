package com.devtalles.tu_cv_spring_boot.cv.controller;

import com.devtalles.tu_cv_spring_boot.cv.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller

@RequestMapping("/cv")
public class CvController {
    @GetMapping({"/index", "", "/"})
    public String index(Model model){
        Person person = new Person("Gabriel", "Chaldú", "Dev");
        model.addAttribute("name", "Je");
        model.addAttribute("persona", person);
        return "index";
    }

    /*@GetMapping({"/pep"})
    public String pep(){
        return "pep";
    }*/
}
