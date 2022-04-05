/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Since currently everything in this controller(Owners) mapps to owner,
// it can be prefix like below
@RequestMapping(value = "/owners")
@Controller
public class OwnersController {

    // empty space need for when just prefix, it work well
    // without empty since spring 5 but just to make sure no
    // assumption.
    @RequestMapping(value = {"", "/", "/index", "/index.html"})
    public String modelDisplayListOfOwners() {

        return "owners/index";
    }
}
