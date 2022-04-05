/**
 * Created by Franklyn Agboma
 */
package com.dev.franklynspringpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = {"", "/", "index", "index.html"})
    public String getModelAndDisplayIndexPage() {
        return "index";
    }
}
