/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping(value = {"/vets", "/vets/index", "/vets/index.html"})
    public String modelADisplayListOfVet() {

        return "vets/index";
    }
}
