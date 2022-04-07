/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.controllers;

import com.dev.franklynspringpetclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// Since currently everything in this controller(Owners) maps to owner,
// it can be prefix like below
@RequestMapping(value = "/owners")
@Controller
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    // empty space need for when just prefix, it work well
    // without empty since spring 5 but just to make sure no
    // assumption.
    @RequestMapping(value = {"", "/", "/index", "/index.html"})
    public String modelDisplayListOfOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
