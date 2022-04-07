/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.controllers;

import com.dev.franklynspringpetclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping(value = {"/vets", "/vets/index", "/vets/index.html"})
    public String modelADisplayListOfVet(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
