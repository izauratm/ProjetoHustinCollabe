package com.senac.hustincollabe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Izaura
 */
@Controller
public class SiteController {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }
}
